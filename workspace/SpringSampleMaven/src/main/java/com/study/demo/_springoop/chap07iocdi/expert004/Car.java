package com.study.demo._springoop.chap07iocdi.expert004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Autowired
	Tire tire;
	
	
	public String getTireBrand() {
		return "장착된 타이어 : "+tire.getBrand();
	}
}
