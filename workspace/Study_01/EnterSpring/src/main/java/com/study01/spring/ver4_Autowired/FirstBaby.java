package com.study01.spring.ver4_Autowired;

public class FirstBaby implements Children {
	
	String strName ="Fist";
	int iAge = 30;
	
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
