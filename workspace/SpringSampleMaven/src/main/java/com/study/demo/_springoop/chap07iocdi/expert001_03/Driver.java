package com.study.demo._springoop.chap07iocdi.expert001_03;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire tire = new KoreaTire();
		
		Car car = new Car();
		car.setTire(tire);
		//Car car = new Car(new KoreaTire());
		
		System.out.println(car.getTireBrand());

	}

}
