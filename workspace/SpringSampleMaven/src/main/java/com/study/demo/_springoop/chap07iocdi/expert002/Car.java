package com.study.demo._springoop.chap07iocdi.expert002;

public class Car {
	
	Tire tire;
	
	public Tire getTire() {
		return tire;
	}
	
	public void setTire(Tire tire) {
		this.tire= tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어 : "+tire.getBrand();
	}
}
