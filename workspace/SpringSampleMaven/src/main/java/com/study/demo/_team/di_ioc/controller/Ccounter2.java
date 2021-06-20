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
import com.study.demo._team.di_ioc.service.Smornigservice;


@Controller
public class Ccounter2 {

	/* Call Service */
	Smornigservice Sms;
	
	/* Smornigservice 객체는 어디에서 날라온것인다 
	 * @Autowired 의 생략
	 * DI 는 생성자를 통한 주입을 하도록 가이드되고 있다.
	 * */
	public Ccounter2(Smornigservice sms) {
		super();
		Sms = sms;
	}


	@RequestMapping("/coffee/morning2")
	public String morning_coffee(HttpServletRequest request, Model model) {
		
		 String strCoffee = "";
		 String strMenu= request.getParameter("coffee"); 
		 System.out.println("Ccounter2 =>"+strMenu);
		
		 int menu = Integer.parseInt(strMenu);
		
		 /* Coffee 서비스 */
		 strCoffee = Sms.getMorning(menu);
		 
		 strCoffee = "Ccounter2 | "+ strCoffee; 
		 
		 model.addAttribute("morning_coffee",strCoffee);
		 
		 return "coffee/morning_coffee";		
	}
}
