package com.study.demo._team.di_ioc.controller;

/**
 * 모닝커피를 접수 받는 카운터 역할을 하는 Controller
 * 각 커피별로 생성자를 직접 생성한다.
 * 스프링 IoC 를 사용하지 않음.
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.demo._team.di_ioc.beans.Americano;
import com.study.demo._team.di_ioc.beans.Cappuccino;
import com.study.demo._team.di_ioc.beans.Latte;


@Controller
public class Ccounter {

	/* 생성자 주입 
	Americano ame 		= new Americano();
	Latte latte   		= new Latte();
	Cappuccino cappu	= new Cappuccino();
	*/
	/* 필드주입
	@Autowired
	Americano ame;
	
	@Autowired
	Latte latte;
	
	@Autowired
	Cappuccino cappu;
	*/
	
	Americano ame;
	Latte latte;
	Cappuccino cappu;
	
	/* 생성자 주입 */
	@Autowired
	public Ccounter(Americano ame, Latte latte, Cappuccino cappu) {
		this.ame = ame;
		this.latte = latte;
		this.cappu = cappu;
	}

	@RequestMapping("/coffee/morning")
	public String morning_coffee(HttpServletRequest request, Model model) {
		
		 String strCoffee = "";
		 String strMenu= request.getParameter("coffee"); 
		 System.out.println("Ccounter =>"+strMenu);
		
		 int menu = Integer.parseInt(strMenu);
		 /* 커피 주문에 따른 메서드 호출 */			
			/* 커피 나왔어요.. */
			if(menu==1) {
				strCoffee = ame.toString();
			}else if(menu==2) {
				strCoffee = latte.toString();
			}else if(menu==3) {
				strCoffee = cappu.toString();
			}
		
		strCoffee = "Ccounter | "+ strCoffee;	
			
		 model.addAttribute("morning_coffee",strCoffee);
		 
		 return "coffee/morning_coffee";		
	}
}
