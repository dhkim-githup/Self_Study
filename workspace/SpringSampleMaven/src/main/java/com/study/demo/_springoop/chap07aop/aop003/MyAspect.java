package com.study.demo._springoop.chap07aop.aop003;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;

/* POJO & XML 기반 - 스프링 프레임워크에 종속되지 않음 */

public class MyAspect {
	 
	public void before(JoinPoint joinPoint){
	  System.out.println("aop003.열쇠로 문을 열고 집에 들어간다.");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
	
	public void after(JoinPoint joinPoint){
		  System.out.println("aop003.소등하고 잔다");
		  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
		 }
}

	
