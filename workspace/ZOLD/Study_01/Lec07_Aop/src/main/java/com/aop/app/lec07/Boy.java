package com.aop.app.lec07;

public class Boy {
	
	public void runSomething(){
		System.out.println("����� ���� ���� ���� ����.");
		
		try {
			System.out.println("��ǻ�ͷ� ������ �Ѵ�.");
			
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