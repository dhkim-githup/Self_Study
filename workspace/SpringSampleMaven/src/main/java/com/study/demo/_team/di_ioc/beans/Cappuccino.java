package com.study.demo._team.di_ioc.beans;

import org.springframework.stereotype.Component;

@Component
public class Cappuccino {
	
	String taste = "우아한 맛";
	int price = 6000;
		
	@Override
	public String toString() {
		return "Cappuccino [taste=" + taste + ", price=" + price + "]";
	}
}
