package com.study01.spring.ver4_Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study01.spring.ver4_Autowired.Console;


/*  @Autowired 를 통한 객체 얻어오기  */
public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 몇째가 집에 올지, XML 을 통해 받아와 
		 * Test 1 . 첫째가 올지 둘째가 올지... 누가 올지.. xml 에서 정의 . 
		 * */
		System.out.println("gogo Main");	
		
		
		Children children;
		
		Console console = new Console(Children children);		
		console.consoleOut();
		

	}
	
}