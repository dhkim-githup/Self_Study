package com.study01.spring.ver3_Xml;

public class SecondBaby implements Children {

	String strName ="Second";
	int iAge = 20;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return strName;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return iAge;
	}

}
