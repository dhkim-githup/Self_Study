package com.study.ver4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Ioc_config_ver4.xml");
		
		Console con = ctx.getBean("console",Console.class);
		con.consoleOut();
		*/
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
				
				Console console = ctx.getBean("con",Console.class);	
				console.consoleOut();
		
		ctx.close();

	}

}
