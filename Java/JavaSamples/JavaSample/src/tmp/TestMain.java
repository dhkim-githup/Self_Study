package tmp;

public class TestMain {

	
	private static TestClass a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Call();
		
		Call(a);
		
	}
	
	/* Step 1
	private static void Call() {
		// TODO Auto-generated method stub
		String myName="";
		
		TestClass a = new TestClass();
		myName = a.CallMe();		
		System.out.println("myName"+myName);
	}
	*/
	
	/* Step2
	private static void Call() {
		// TODO Auto-generated method stub
		String myName="";
		
		a = new TestClass();
		myName = a.CallMe();		
		System.out.println("myName"+myName);
	}
	*/
	
	private static void Call(TestClass para) {
		// TODO Auto-generated method stub
		String myName="";
		
		myName = para.CallMe();		
		System.out.println("myName"+myName);
	}

}
