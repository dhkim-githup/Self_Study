package com.spring.scope;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main3 {
	
	@RequestMapping("/main3")
	public String doTest(HttpServletRequest request) {
		
		ServiceBeanScope serviceBeanScope = new ServiceBeanScope();
		
		//ServiceTest serviceTest = new ServiceTest();
		System.out.println("");
		System.out.println("Main3");
		System.out.println("serviceBeanScope  => "+serviceBeanScope);
		
		String name = serviceBeanScope.getName();		
		System.out.println("name =>"+name);
		
		
		String reName = request.getParameter("name");
		serviceBeanScope.setName(reName);
		
		name = serviceBeanScope.getName();		
		System.out.println("param =>"+name);		
		
		return name;
	}
}
