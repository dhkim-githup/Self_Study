package com.study.demo._springoop.chap07aop.aop004;

// 횡단 관심사를 모두 지운다.
public class Boy implements Person {
	
	 @Override
	 public void runSomething() {
		 // 핵심 관심사
			  System.out.println("aop004.컴퓨터로 게임을 한다.");
	 }
}
