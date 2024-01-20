package Inheritance.Mammal;

import Inheritance.Animal;

public class Mammal extends Animal {

	public Mammal(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void doRun(String name) {
		System.out.printf("내 이름은 %s , 나는 달릴 수 있어 \n", name);
	}

}
