package com.study01.spring.ver4_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Children children() {
		System.out.println("Children Bean");
		return new FirstBaby();
	}
	
	@Bean 
	public Console console() {
		System.out.println("Console Bean");
		return new Console(children());
	}
}
