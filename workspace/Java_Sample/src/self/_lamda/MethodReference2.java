package self._lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;



public class MethodReference2 {

	public static void main(String[] args) {
		
		Sample2 sample2 = new Sample2();
		
		/* 샘플로 사용할  List 준비 */
		List<String> list1;
		  list1 = new ArrayList<String>();
		  list1.add("One");
		  list1.add("Two");
		  list1.add("Three");
		  list1.add("Four");
		
		  /*1 forEach -> Lamda -> Method Reference 
			 * forEach 는 Consumer 펑션을 사용하고, 인자값이 명확하기 때문에 
			 * 아래와 같이 :: 을 이용하여 바로 출력을 할 수 있는 기능을 허락함. 
			 */
		  
		System.out.println("-----> Method Reference");
		list1.forEach(str ->System.out.println(str)); // Lamda
		
		/* Method Reference ,  str 변수가 동일하고 void 함수라 바로 출력  */
		list1.forEach(	System.out::println );	      
		
		/* 2. 직접 클래스를 사용하기 
		 * method 는 static 으로 사용 
		 */
		System.out.println("-----> Static Method Reference");
		list1.forEach(Sample :: doPrint);	  
		
		
		
		/* 람다식 사용 
		 * 메소드를 람다로 사용하지 않고도 사용 가능
		 * 많은 예제에서 static 을 사용하지만, 바람직한지는 한번쯤 생각해보는것도 좋을듯함.
		 * */
		System.out.println("---------------------------------");	
		
		Function<String, String> sample2Lamda = (name) -> sample2.doPrint2(name);
		System.out.println(sample2Lamda.apply("홍길동"));
		
		/* 람다 + Method Reference 
		 * 뒤에 인자값 name 이 동일하기때문에 생략가능(예측가능)
		 * */
		Function<String, String> sample2Lamda2 =  sample2 ::doPrint2;
		System.out.println(sample2Lamda2.apply("홍길순"));
		
		
	}

}

class Sample{
	public static void doPrint(Object obj) {
		System.out.println(obj);
	}
}


class Sample2{
	public String doPrint2(String name) {
		return "Sample2 : "+name;
	}
}

