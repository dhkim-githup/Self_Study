package com.study.demo._team.aop.book.aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Start {
	
public static void main(String[] args) {
		
		// Spring IoC 에 NyAspect, Boy 를 넣는다. xml 이용 
		ApplicationContext context = 
				 new FileSystemXmlApplicationContext("classpath:aop002/aop002.xml");
		  
		// Spring IoC 에서 boy, girl 를 가져온다.
		// 가져오는 값을 Person interface 를 사용한다. 
		 Person romeo  = (Person)context.getBean("boy", Person.class);
		 Person juliet = (Person)context.getBean("girl", Person.class);
		 
		  
		 // 실행 전 before MyAspect 실행
		 System.out.println("aop002.Boy ===> 실행 전 before MyAspect 실행");
		 romeo.runSomething();
		 
		 System.out.println();
		 
		 System.out.println("aop002.Girl ===> 실행 전 before MyAspect 실행");
		 juliet.runSomething();
	}

}
