package com.study01.spring.ver1;

/* 우리모두 한가족.. */
public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모님. 집 
		MainFamily mf = new MainFamily();
		
		// 큰아들
		mf.firstBaby();
		
		// 둘째아들 
		mf.secondBaby();

	}

	public void firstBaby() {
		String strName="First";
		int iAge = 10;
		System.out.println("Name=>"+strName);
		System.out.println("Age=>"+iAge);		
	}	
	
	public void secondBaby() {
		String strName="Second";
		int iAge = 8;
		System.out.println("Name=>"+strName);
		System.out.println("Age=>"+iAge);		
	}
	
}
