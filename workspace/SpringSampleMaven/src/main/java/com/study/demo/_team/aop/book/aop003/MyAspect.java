package com.study.demo._team.aop.book.aop003;

import org.aspectj.lang.JoinPoint;

/* POJO & XML 기반 - 스프링 프레임워크에 종속되지 않음 */

public class MyAspect {
	 
	public void before(JoinPoint joinPoint){
	  System.out.println("aop002.얼굴 인식 확인: 문을 개방하라");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
}

	
