package com.aop.app.lec07v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lec07v2.xml");
		
		Person boy = ctx.getBean("boy", Person.class);		
		boy.runSomething();
		
		Person girl = ctx.getBean("girl", Person.class);		
		girl.runSomething();

	}

}
