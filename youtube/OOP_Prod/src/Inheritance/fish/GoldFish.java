package Inheritance.fish;

import Inheritance.Swim;
import Inheritance.Swim2;

public class GoldFish extends Fish implements Swim, Swim2
{

	public GoldFish(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSwim(String name) {
		System.out.printf("내 이름은 %s , 나는 헤엄을 칠 수 있어 ~~ \n", name);
		
	}

	@Override
	public String doFreeSwim(String kind) {
		// TODO Auto-generated method stub
		return kind;
	}
	
	

	
}
