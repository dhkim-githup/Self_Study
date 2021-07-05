package com.study.demo._team.aop.book.aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect 
public class MyAspect {
	
    /* 특정 위치(패키지)의 메소드에서만 실행 */
	//@Before("execution(public void com.study.demo._team.aop.book.aop002.Boy.runSomething())")
   
    /* 해당 메서드는 모두 적용 */
    //@Before("execution(* runSomething())") // 모든 메서드 runSomething 을 사용하는 모든 위치

	/* Proxy pattern 사용 */ 
	//@Before("execution(public void com.study.demo._team.aop.book.aop002.Person.runSomething())")
	
	 @Before("execution(public void com.study.demo._team.aop.book.aop002.Boy.runSomething())")
	 public void before(JoinPoint joinPoint){
	  System.out.println("aop002.MyAspect. 얼굴 인식 확인: 문을 개방하라");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }

}
	
