package com.study.ver4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	
	@Bean
	public FirstBaby fb() {
		FirstBaby fb = new FirstBaby();
		return fb;
	}
	
	@Bean(name="baby")	
	public SecondBaby children() {
		SecondBaby sb = new SecondBaby();
		return sb;
	}
	
	/*
	@Bean
	public Console con() {
		Console con = new Console(fb());
		return con;
	}
	*/
	@Bean
	public Console con() {
		Console con = new Console();
		return con;
	}
	
	
	
	

	
}
