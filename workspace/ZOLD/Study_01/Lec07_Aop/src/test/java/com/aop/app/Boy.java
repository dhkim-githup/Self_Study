package com.aop.app;

import org.junit.Test;

public class Boy {
	
	@Test
	public void runSomething(){
		System.out.println("����� ���� ���� ���� ����.");
		
		
	try {
		
	}catch (Exception ex) {
		if(ex.getMessage().contentEquals("���� �ҳ�")) {
			System.out.println("119�� �Ű��Ѵ�.");
		}	
		
	}finally {
		System.out.println("�ҵ��ϰ� �ܴ�");
	}
	
	
	System.out.println("�ڹ��踦 ��װ� ���� ������.");
		
	}

}
