package com.study.demo._team.di_ioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cbeans {
	
	@Autowired
	DefaultListableBeanFactory df;

	@RequestMapping("/mybean")
	public String myBean() {
		
		String strBean="";
		int count=0;
		
		for(String str : df.getBeanDefinitionNames()) {
			strBean += df.getBean(str).getClass().getName() + "<br>";  
			count++;
		}
		
		return "Total : "+count+"<p>"+strBean;
	}
}
