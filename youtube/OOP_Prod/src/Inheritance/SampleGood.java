package Inheritance;

import Inheritance.Bird.Sparrow;
import Inheritance.Mammal.Cat;
import Inheritance.Mammal.Dog;

public class SampleGood {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat("야옹이", 5);
		cat.doShowMe(cat.getName(), cat.getAge());
		
		Dog dog = new Dog("바둑이",7);
		dog.doShowMe(dog.getName(), dog.getAge());
		dog.doRun(dog.getName());
		
		Sparrow sparrow = new Sparrow("아침", 2);
		sparrow.doShowMe();
		sparrow.doFly(sparrow.getName());
		
	}

}
