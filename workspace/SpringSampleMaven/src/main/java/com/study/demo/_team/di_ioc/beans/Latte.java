package com.study.demo._team.di_ioc.beans;

import org.springframework.stereotype.Component;

@Component
public class Latte {
	
	String taste = "달콤한 맛";
	int price = 5000;
		
	@Override
	public String toString() {
		return "Latte [taste=" + taste + ", price=" + price + "]";
	}
}
