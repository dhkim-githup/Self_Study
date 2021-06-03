import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Foreach {

	public static void main(String[] args) {
		
		System.out.println("============================= Sample 0 , Tutorial =============================");
		
		for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
		
		
		System.out.println("============================= Sample 1 , Arry =============================");
		String[] temp = { "aa", "bb", "cc" };
		for (int i = 0; i < temp .length; i++) { 
		    System.out.println(temp[i]);
		}
		
		for (String el : temp) {
		    System.out.println(el);
		}
		
		/* stream 사용 */
		Arrays.stream(temp).forEach(str -> System.out.println("stream."+str));
		
		Arrays.stream(temp).forEach(System.out :: println);
		
		
		System.out.println("============================= Sample 2 , List =============================");
		
		 List<String> list1;
		  list1 = new ArrayList<String>();
		  list1.add("One");
		  list1.add("Two");
		  list1.add("Three");
		  list1.add("Four");
		
		  for(int i=0; i<list1.size(); i++) {
			  System.out.println("Value : "+list1.get(i));
		  }
		  
		  // Iterator 함수를 통한 조회
		  Iterator<String> iterator = list1.iterator();
		  while (iterator.hasNext()) {
		      String str = (String) iterator.next();
		      System.out.println("Value : "+str);
		  }
		  
		  // For
		  for(String str : list1) {			  
		      System.out.println("Value2 : "+str);
		  }		  
		  
		  /* Lamda 사용 */		  
		  list1.forEach(str ->System.out.println(str));
		  list1.forEach(System.out :: println);
		  
		  System.out.println("============================= Sample 3 , Set =============================");
		  
		  Set<String> set = new HashSet<>();
		  set.add("Paris");
		  set.add("Seoul");
		  set.add("Tokyo");
		  set.add("Washington");

		  set.forEach(item -> System.out.println(item));

	}

}
