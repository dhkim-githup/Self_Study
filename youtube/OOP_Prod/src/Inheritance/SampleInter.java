package Inheritance;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Inheritance.Bird.*;
import Inheritance.Mammal.Cat;
import Inheritance.Mammal.Dog;
import Inheritance.fish.GoldFish;

/**
 * 다형성 공부 
 */

public class SampleInter {
	
	public static void main(String[] args) {

		GoldFish fish = new GoldFish("금붕어", 10);
		fish.doSwim(fish.getName());
		
		System.out.println("나는 "+fish.doFreeSwim("자유형")+" 을 할 수 있어요.");
		
		Penguin penguin = new Penguin("펭귄", 20);
		penguin.doSwim(penguin.getName());
		
		System.out.println("Hi");
	
		
	}

}
