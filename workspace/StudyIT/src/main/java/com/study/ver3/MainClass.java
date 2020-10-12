package com.study.ver3;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Ioc_config_ver3.xml");
		
		Console con = ctx.getBean("console",Console.class);
		con.consoleOut();
		
		
		ctx.close();

	}

}
