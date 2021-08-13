package com.spring.singleton;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main2 {

	@Autowired
	ServiceNormal serviceNormal;
	
	@Autowired
	ServiceTest serviceTest;
	
	@RequestMapping("/normal2")
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
	
	@RequestMapping("/test2")
	public String doTest(HttpServletRequest request) {
		
		//ServiceTest serviceTest = new ServiceTest();
		
		System.out.println("");
		
		System.out.println("ServiceNormal =>"+serviceNormal);
		System.out.println("serviceTest =>"+serviceTest);
		
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
