package com.aop.app.lec07v2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint) {
		System.out.println("�� �ν� Ȯ��: ���� �����϶�");
		// System.out.println("����� ���� ���� ���� ����.");
	}
	
	@After("execution(* runSomething())")
	public void lockdoor(JoinPoint joinPoint) {
		System.out.println("���δ��� �����ߴ�. ���� �ݾƶ�");
		// System.out.println("����� ���� ���� ���� ����.");
	}
}