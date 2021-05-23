package team.study._lamda.standardapi;

import java.util.function.Function;

public class FunctionSample {

	public static void main(String[] args) {
		
		Function<String, String> ff = (t) -> t;
		System.out.printf("Result1 is %s \n",ff.apply("HongGilDong"));
		
		Function<Friend, String> f = (t) -> t.name;
		Friend friend = new Friend();
		System.out.printf("Result2 is %s \n",f.apply(friend));
		
		Function<Friend, Integer> f2 = (t) -> t.age;
		System.out.printf("Result3 is %s \n",f2.apply(new Friend()));
		
	}
}

class Friend{	
	String name = "HongGilDong"; 
	int age = 20;
	
}