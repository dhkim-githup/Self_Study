package tmp;

public class MemoryClass {
	
	String glbName="GlobalName";
	
	public static String sttName="StaticName";

	public static void doGet2(String strName, int age) {		
		// TODO Auto-generated method stub
		String doName=strName;
		int doAge=age;

		System.out.printf("doGet2. Name : %s, Age : %d", doName, doAge);
		
	}

}
