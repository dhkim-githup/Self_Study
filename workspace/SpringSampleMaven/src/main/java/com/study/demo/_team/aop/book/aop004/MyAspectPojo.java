package com.study.demo._team.aop.book.aop004;

import org.aspectj.lang.JoinPoint;

/* POJO & XML 기반 - 스프링 프레임워크에 종속되지 않음 */

public class MyAspectPojo {
	 
	public void before(JoinPoint joinPoint){
	  System.out.println("aop004pojo.얼굴 인식 확인: 문을 개방하라");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
	
	public void lockDoor(JoinPoint joinPoint){
		  System.out.println("aop004pojo.소등하고 잔다!!!");
		  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
		 }
		
}

	
