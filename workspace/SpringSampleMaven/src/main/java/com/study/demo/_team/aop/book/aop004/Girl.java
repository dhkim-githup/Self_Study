package com.study.demo._team.aop.book.aop004;

//횡단 관심사를 모두 지운다.
public class Girl implements Person {
	
	 public void runSomething() {
			  // 핵심 관심사
			  System.out.println("aop004.요리를 한다.");			
		 }
}
