package self._generic.lifecoding;

public class SampleMain {

	public static void main(String[] args) {
		
		Person<String> p1 = new Person<String>();		
		p1.info = "String";
		
		System.out.println("p1.info => "+p1.info);

		Person<Integer> p2 = new Person<Integer>();		
		p2.info = 100;
		System.out.println("p2.info => "+p2.info);
		
	}

}
