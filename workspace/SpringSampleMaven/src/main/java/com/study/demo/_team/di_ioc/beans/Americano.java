package com.study.demo._team.di_ioc.beans;

import org.springframework.stereotype.Component;

@Component
public class Americano {

	String taste = "깔끔한 맛";
	int price = 4000;
		
	@Override
	public String toString() {
		return "Americano [taste=" + taste + ", price=" + price + "]";
	}
}
