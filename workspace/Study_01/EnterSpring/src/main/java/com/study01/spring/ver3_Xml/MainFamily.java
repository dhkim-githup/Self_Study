package com.study01.spring.ver3_Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/* Xml 을 통한 관리  */
public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		/* 몇째가 집에 올지, XML 을 통해 받아와 
		 * Test 1 . 첫째가 올지 둘째가 올지... 누가 올지.. xml 에서 정의 . 
		 * */
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Ioc_config_ver3.xml");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Ioc_config_ver3.xml");
		
		Console console = (Console) ctx.getBean("console",Console.class);		
		console.consoleOut();
		
		ctx.close();

	}		
}

