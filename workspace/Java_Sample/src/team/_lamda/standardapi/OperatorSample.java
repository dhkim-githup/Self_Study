package team._lamda.standardapi;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorSample {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> b = (t1, t2) ->{
			int sum = t1 + t2;
			return sum;			
		};
		System.out.println("Sum is "+b.apply(10, 20));
		
		
		UnaryOperator<String> u = t -> t;
		System.out.println(u.apply("Hello Unary"));
		
		UnaryOperator<String> u2 = (t) -> {
			Friend2 f = new Friend2();
			return f.name;
		};
		System.out.println("Result is "+u2.apply("Hi"));
		
	}
		
}

class Friend2{	
	String name = "HongGilDong"; 
	int age = 20;
	
}