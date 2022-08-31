package self._lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 샘플로 사용할  List 준비 */
		List<String> list1;
		  list1 = new ArrayList<String>();
		  list1.add("One");
		  list1.add("Two");
		  list1.add("Three");
		  list1.add("Four");
		
		  
		// 0. for(int i=0; list1.size(); i++){~~} */		  
		// 1. for 구문 사용 for(String str : list1) {System.out.println(str);}
		
		System.out.println("-----> @FunctionalInterface  Consumer");
		
		// 2. forEach 구문 익명함수 - Consumer<? super String> action;
		list1.forEach(new Consumer<String>(){
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}
		});
		
		System.out.println("-----> Lamda");		
		// 2. forEach 구문 사용 - Lamda
		list1.forEach(str ->System.out.println(str));
		
		
		/* 3 forEach -> Lamda -> Method Reference 
		 * forEach 는 Consumer 펑션을 사용하고, 인자값이 명확하기 때문에 
		 * 아래와 같이 :: 을 이용하여 바로 출력을 할 수 있는 기능을 허락함. 
		 */
		System.out.println("-----> Method Reference");
		list1.forEach(	System.out::println );		

	}

}
