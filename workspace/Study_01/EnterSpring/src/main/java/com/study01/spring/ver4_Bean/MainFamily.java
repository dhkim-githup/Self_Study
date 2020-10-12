package com.study01.spring.ver4_Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;






/*  @Autowired 를 통한 객체 얻어오기  */
public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 몇째가 집에 올지, XML 을 통해 받아와 
		 * Test 1 . 첫째가 올지 둘째가 올지... 누가 올지.. xml 에서 정의 . 
		 * */
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Ioc_config_ver4.xml");
		
		// Xml -> Java 로 변환 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Console console = ctx.getBean("console",Console.class);	
		console.consoleOut();
		
		
		ctx.close();

	}		
}