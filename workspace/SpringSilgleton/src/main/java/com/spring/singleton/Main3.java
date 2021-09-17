package com.spring.singleton;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main3 {

	@Autowired
	ServiceSingleton serviceNormal;
	
	
	@RequestMapping("/normal3")
	public String doNormal() {			
		
		String name;
		
		System.out.println("");
		
		name = serviceNormal.getName();		
		System.out.println("name1 =>"+name);
		
		serviceNormal.setName("홍길순");
		
		name = serviceNormal.getName();		
		System.out.println("name2 =>"+name);
		
		
		return name;
	}
	
	@RequestMapping("/main3")
	public String doTest(HttpServletRequest request) {
		
		ServicePrototype serviceTest = new ServicePrototype();
		
		System.out.println("");
		System.out.println("Main3");
		
		System.out.println("ServiceSingleton => "+serviceNormal);
		System.out.println("serviceTest      => "+serviceTest);
		
		String reName = request.getParameter("name");
		String name;
		
		name = serviceTest.getName();		
		System.out.println("name1 =>"+name);
		
		serviceTest.setName(reName);
		
		name = serviceTest.getName();		
		System.out.println("name2 =>"+name);
		
		
		return name;
	}
}
