package team.study._lamda.standardapi;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 매개변수가  KIM 이면 true */
		Predicate<String> p = t ->{
			if(t.equals("KIM")){
				return true;
			}else {
				return false;
			}					
		};
		
		System.out.println("Result is "+p.test("KIM"));
		
	   /* 두 숫자가 1~9 일때 true */	
	   BiPredicate<Integer, Integer> b = (t,u) ->{
		 
		   if(t>0 && u<10) {
			   return true;
		   }else {
			   return false;
		   }
	   };
	   
	   System.out.println("Result is "+b.test(5,19));	   

	}

}
