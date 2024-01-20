package Inheritance;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Inheritance.Bird.*;
import Inheritance.Mammal.Cat;
import Inheritance.Mammal.Dog;

/**
 * 다형성 공부 
 */

public class SamplePoly {
	
	public static void main(String[] args) {

		Animal sparrow1 = new Sparrow("아침", 2);
		sparrow1.doShowMe(sparrow1.getName(), sparrow1.getAge());
		//sparrow1.doFly(sparrow1.getName());
		
		Bird sparrow2= new Chicken("점심", 3);
		sparrow2.doShowMe(sparrow2.getName(), sparrow2.getAge());
		//sparrow2.doFly(sparrow2.getName());
				
		Sparrow sparrow = new Sparrow("저녁", 4);
		sparrow.doShowMe(sparrow.getName(), sparrow.getAge());
		//sparrow.doFly(sparrow.getName());
		
		System.out.println("Hi");
	
		
	}

}
