package com.study01.spring.ver1;

/* 우리모두 한가족.. - 아부지 나도 방 따로 줘요. */
public class MainFamily_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstBaby firstbaby = new FirstBaby();
		SecondBaby secondbaby = new SecondBaby();
		
		
		firstbaby.firstBaby();		
		
		secondbaby.secondBaby();

	}		
}
/*
class FirstBaby{
	
	public void firstBaby() {
		String strName="First";
		int iAge = 10;
		System.out.println("Name=>"+strName);
		System.out.println("Age=>"+iAge);		
	}	
	
}

class SecondBaby{
	
	public void secondBaby() {
		String strName="Second";
		int iAge = 8;
		System.out.println("Name=>"+strName);
		System.out.println("Age=>"+iAge);		
	}
	
}
*/
