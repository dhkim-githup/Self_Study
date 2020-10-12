package com.study01.spring.ver4_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	/* 첫째 아들 Bean */
	@Bean
	public FirstBaby firstBaby() {
		FirstBaby fb = new FirstBaby();
		return fb;
	}
	
	/* 둘째 아들 Bean */
	@Bean
	public SecondBaby secondBaby() {
		SecondBaby sb = new SecondBaby();
		return sb;
	}
	
	/* 누가 올거야... */
	@Bean
	public Console console() {
		Console cl = new Console(firstBaby());
		return cl;
	}
	
	

}
