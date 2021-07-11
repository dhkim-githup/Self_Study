package com.study.demo._springoop.chap07iocdi.expert004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("chap07/expert004.xml");
		
		Car car =   context.getBean("car", Car.class);
		
		//Tire tire = context.getBean("tire", Tire.class);
		//car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}

}
