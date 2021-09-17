package com.spring.singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServicePrototype {
	
	String name="이성계";
	
	public ServicePrototype() {
		System.out.println("ServicePrototype - Constructor");
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
