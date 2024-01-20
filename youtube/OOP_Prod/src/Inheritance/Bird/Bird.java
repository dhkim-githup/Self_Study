package Inheritance.Bird;

import Inheritance.Animal;

public class Bird extends Animal  {

	public Bird(String name, int age) {
		super(name, age);		
	}
	
	
	@Override
	public void doShowMe(String name, int age) {
		System.out.printf("조류 : 내 이름은 %s , 내 나이는 %d \n", name, age);
	}
	
	
	// 날수 있다
	public void doFly(String name) {
		System.out.printf("내 이름은 %s , 나는 날수도 있어 \n", name);
	}
}
