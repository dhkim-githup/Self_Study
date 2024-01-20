package Inheritance.Bird;

import Inheritance.Swim;

public class Penguin extends Bird implements Swim  {

	public Penguin(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doFly(String name) {
		// TODO Auto-generated method stub
		super.doFly(name);
	}

	@Override
	public void doSwim(String name) {
		System.out.printf("내 이름은 %s , 나는 조류지만 헤엄을 칠 수 있어 ~~ \n", name);
	}
	
}
