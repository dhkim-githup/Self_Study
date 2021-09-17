package com.spring.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class ServiceBeanScope {
	
	String name="홍길동";
	
	public ServiceBeanScope() {
		System.out.println("ServiceBeanScope - Constructor");
	}
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
		
	}
	
	/*
	@PostConstruct
    public void postConstruct() {
        System.out.println("ServiceTest - postConstruct");
    }
	
	@PreDestroy
    public void preDestroy() {
		System.out.println("preDestroy");
    }
    */

}
