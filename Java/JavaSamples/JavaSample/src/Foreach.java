import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 자바는 1.5 버전부터 foreach loop 를 지원하고 있습니다.
 * 기존에 사용하던 for 구문을 벗어나, 특히 collection 구조를 아주 손쉽게 사용하도록 합니다.
 * 아래 샘플을 직접 실행해보면 쉽게 이해가 될것으로 보입니다.
 * @author dhkim
 * @since 2021.06.03
 */

public class Foreach {

	public static void main(String[] args) {
		
		System.out.println("============================= Sample 0 , Tutorial =============================");
		
		/*  기본 for 구문 */
		for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
		
		/* 배열을 이용한 enhanced for 구문 */
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
		
		
		System.out.println("============================= Sample 1 , Arry =============================");
		
		/*  기본 for 구문 */
		String[] temp = { "aa", "bb", "cc" };
		for (int i = 0; i < temp .length; i++) { 
		    System.out.println(temp[i]);
		}
		
		/* 배열을 이용한 enhanced for 구문 */
		for (String el : temp) {
		    System.out.println(el);
		}
		
		/* java1.8 이후 등장한  forEach , stream 메서드 사용 */
		Arrays.stream(temp).forEach(str -> System.out.println("stream."+str));
		
		/* java1.8 이후 등장한  forEach , stream 메서드 사용, :: 구문 사용  */
		Arrays.stream(temp).forEach(System.out :: println);
		
		
		System.out.println("============================= Sample 2 , List =============================");
		
		 List<String> list1;
		  list1 = new ArrayList<String>();
		  list1.add("One");
		  list1.add("Two");
		  list1.add("Three");
		  list1.add("Four");
		
		  /*  기본 for 구문 */
		  for(int i=0; i<list1.size(); i++) {
			  System.out.println("Value : "+list1.get(i));
		  }
		  
		  /* Iterator 함수를 통한 조회 */
		  Iterator<String> iterator = list1.iterator();
		  while (iterator.hasNext()) {
		      String str = (String) iterator.next();
		      System.out.println("Value : "+str);
		  }
		  
		  /* 배열을 이용한 enhanced for 구문 */
		  for(String str : list1) {			  
		      System.out.println("Value2 : "+str);
		  }		  
		  
		  /* java1.8 이후 등장한  forEach , Lamda expression 사용 */		  
		  list1.forEach(str ->System.out.println(str));
		  list1.forEach(System.out :: println);
		  
		  System.out.println("============================= Sample 3 , Set =============================");
		  
		  Set<String> set = new HashSet<>();
		  set.add("Paris");
		  set.add("Seoul");
		  set.add("Tokyo");
		  set.add("Washington");

		  /* java1.8 이후 등장한  forEach , Lamda expression 사용 */
		  set.forEach(item -> System.out.println(item));

	}

}
