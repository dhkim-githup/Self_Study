package com.study.demo._team.di_ioc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect 
public class MyAspect {
	
	public MyAspect() {
		System.out.println("MyAspect Bean");
	}
			
    /* 특정 위치(패키지)의 메소드에서만 실행 */
	//@Before("execution(public void com.study.demo._team.aop.book.aop002.Boy.runSomething())")
    
    /* 해당 메서드는 모두 적용 */
    @Before("execution(* getMorning(..))") // 모든 메서드 runSomething 을 사용하는 모든 위치
	//@Before("execution(* com.study.demo._team.di_ioc.Smornigservice.*(..))") // 모든 메서드 runSomething 을 사용하는 모든 위치
	 public void before(JoinPoint joinPoint){
	  System.out.println("@Before.커피주문 들어왔어요.");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
    
    /* 해당 메서드는 모두 적용 */
    @AfterReturning("execution(* getMorning(..))") // 모든 메서드 runSomething 을 사용하는 모든 위치
	 public void afterRe(JoinPoint joinPoint){
	  System.out.println("@AfterReturning.. 커피 나가요... !!!");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
    
    
    /* 해당 메서드는 모두 적용 */
    @After("execution(* getMorning(..))") // 모든 메서드 runSomething 을 사용하는 모든 위치
	 public void lockDoor(JoinPoint joinPoint){
	  System.out.println("@After.커피주문 완료 !!!");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }    
  
    
    /* 해당 메서드는 모두 적용 */
    @AfterThrowing("execution(* getMorning(..))") // 모든 메서드 runSomething 을 사용하는 모든 위치
	 public void afterTh(JoinPoint joinPoint){
	  System.out.println("@AfterThrowing. 커피가 다 떨어졌어요. !!!");
	  //System.out.println("열쇠로 문을 열고 집에 들어간다.");
	 }
    
    /* 해당 메서드는 모두 적용 */
    @Around("execution(* getMorning(..))") // 모든 메서드 runSomething 을 사용하는 모든 위치
    public Object logging(ProceedingJoinPoint pjp) throws Throwable{    
	  System.out.println("@Around. 클라이언트 호출을 잠시 가로채가요 . !!!");
	  Object result = pjp.proceed();

	  return result;
	 }

}
	
