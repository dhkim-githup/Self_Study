package com.spring.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWarApplication.class, args);
		
		System.out.println("main method");
	}

}
