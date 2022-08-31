package tmp;

public class MemoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strName ="Kim";
		int age = 30;
		
		doGet(strName, age);
		
		MemoryClass mc = new MemoryClass();
		
		mc.doGet2(strName, age);
		
		System.out.println("-- End --");

	}

	private static void doGet(String strName, int age) {		
		// TODO Auto-generated method stub
		String doName=strName;
		int doAge=age;

		System.out.printf("Name : %s, Age : %d", doName, doAge);
		
	}

}
