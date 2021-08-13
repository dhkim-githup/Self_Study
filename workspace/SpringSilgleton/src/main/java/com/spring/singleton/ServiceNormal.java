package com.spring.singleton;

import org.springframework.stereotype.Component;

@Component
public class ServiceNormal {

	String name="홍길동";
	
	
	public String getName() {
		// TODO Auto-generated method stub		
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
		
	}
	


}
