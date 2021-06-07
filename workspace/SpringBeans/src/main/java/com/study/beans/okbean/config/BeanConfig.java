package com.study.beans.okbean.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.study.beans.okbean.service.PersonService3;


// @ComponentScan({"com.study.beans.okbean"}) // Spring mvc 에서는 해당 구문이 필요하나, boot 에서는 불필요함 (@SpringBootApplication 이 포함함)
@Configuration
public class BeanConfig {

	@Bean
	@Qualifier("PersonService3")
	@Scope("prototype") // default-singleton,  prototype 
	public PersonService3 personService3() {
		return new PersonService3();
	}
	
	
}
