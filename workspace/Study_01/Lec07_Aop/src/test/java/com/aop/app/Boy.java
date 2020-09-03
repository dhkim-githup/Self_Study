package com.aop.app;

import org.junit.Test;

public class Boy {
	
	@Test
	public void runSomething(){
		System.out.println("열쇠롤 문을 열고 집에 들어간다.");
		
		
	try {
		
	}catch (Exception ex) {
		if(ex.getMessage().contentEquals("집에 불남")) {
			System.out.println("119에 신고한다.");
		}	
		
	}finally {
		System.out.println("소등하고 잔다");
	}
	
	
	System.out.println("자물쇠를 잠그고 집을 나선다.");
		
	}

}
