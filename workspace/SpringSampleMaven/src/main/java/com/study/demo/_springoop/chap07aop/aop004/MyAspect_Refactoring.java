package com.study.demo._springoop.chap07aop.aop004;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect 
public class MyAspect_Refactoring {
	
	/* Pointcut 공통부분으로 정의 */
	@Pointcut("execution(* runSomething())") 
	private void iampc() {
		// 여긴 무엇을 작성해도 의미가 없어요.
	}
	
   
    @Before("iampc()") // 모든 메서드 runSomething 을 사용하는 모든 위치
	 public void before(JoinPoint joinPoint){
	  System.out.println("aop004-Refactoring.얼굴 인식 확인: 문을 개방하라");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
    
    
    /* 해당 메서드는 모두 적용 */
    @After("iampc()") // 모든 메서드 runSomething 을 사용하는 모든 위치
	 public void lockDoor(JoinPoint joinPoint){
	  System.out.println("aop004-Refactoring.주인님 나갔다 : 어이 문 잠가 !!!");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
    

}
	
