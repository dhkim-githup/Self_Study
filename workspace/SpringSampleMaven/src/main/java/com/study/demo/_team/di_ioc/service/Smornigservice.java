package com.study.demo._team.di_ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo._team.di_ioc.beans.Americano;
import com.study.demo._team.di_ioc.beans.Cappuccino;
import com.study.demo._team.di_ioc.beans.Latte;

@Service
public class Smornigservice {
	
	Americano ame;
	Latte latte;
	Cappuccino cappu;
	
	/* 생성자 객체 주입 */
	@Autowired
	public Smornigservice(Americano ame, Latte latte, Cappuccino cappu) {
		this.ame = ame;
		this.latte = latte;
		this.cappu = cappu;
	}


	public String getMorning(int menu) {
		
		 String strCoffee = "";
		
		 /* 커피 주문에 따른 메서드 호출 */			
			/* 커피 나왔어요.. */
			if(menu==1) {
				strCoffee = ame.toString();
			}else if(menu==2) {
				strCoffee = latte.toString();
			}else if(menu==3) {
				strCoffee = cappu.toString();
			}
		
		return strCoffee;
			
	}
	
	

}
