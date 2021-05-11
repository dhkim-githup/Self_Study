package book.oopforsprings.lec04._final;

public class Cat_Super {

	public void doOK() {		
	}
	
	// 내가 마지막이야.. 더 사용하지 못해
	public final void doNO() {		
	}
}

//상속을 허용하지 않아서 오류 발생
class Cat_Child extends Cat_Super {

	public void doOK() {
		System.out.println("I can override of doOK method...");
	}
	
	//Cannot override the final method from Cat_Super
	public void doNO() {
		System.out.println("I can override of doOK method...");
	}
}
