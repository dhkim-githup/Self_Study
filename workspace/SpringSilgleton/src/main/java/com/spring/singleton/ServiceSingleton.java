package com.spring.singleton;

import org.springframework.stereotype.Component;

@Component
public class ServiceSingleton {

	String name="홍길동";
	
	public ServiceSingleton() {
		System.out.println("ServiceSingleton - Constructor");
	}

	
	public String getName() {
		// TODO Auto-generated method stub		
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
		
	}
	


}
