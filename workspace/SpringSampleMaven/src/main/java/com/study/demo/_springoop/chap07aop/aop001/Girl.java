package com.study.demo._springoop.chap07aop.aop001;

public class Girl {
	
	 public void runSomething() {
		 
		  // 횡단 관심사
		  System.out.println("열쇠로 문을 열고 집에 들어간다.");
		  
		  try {
			  
			  // 핵심 관심사
			  System.out.println("요리를 한다.");
			  
		  } catch (Exception ex) {
		    if(ex.getMessage().equals("집에 불남")) {
		      // 횡단 관심사
		      System.out.println("119 에 신고한다.");
		    }   
		  } finally {
			  // 횡단 관심사
			  System.out.println("소등하고 잔다.");
		  }
		 
		
		 }
}
