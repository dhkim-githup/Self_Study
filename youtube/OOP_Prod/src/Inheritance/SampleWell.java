package Inheritance;

import Inheritance.Bird.Bird;
import Inheritance.Mammal.Mammal;

public class SampleWell {
	
	public static void main(String[] args) {
		
		Bird bird = new Bird("참새", 10);		
		bird.doShowMe();
		
		Mammal mammal = new Mammal("고양이",10);
		mammal.doShowMe();
		
	}
}
