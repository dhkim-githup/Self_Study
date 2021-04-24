package abstrtact;

public class AbsMain {

	public static void main(String[] args) {
		System.out.println("========= AbsMain ==============");
		
		//A a = new A();
		B b = new B();
		b.d();
		System.out.println(b.b());
	}
}


 abstract class A{
	
	public abstract int b(); // 구현되지 않은 정의만 됨.
	
	//public abstract int c() { // Abstract methods do not specify a body
	public  int c() { // Abstract methods do not specify a body
		int a=10;
		return a;
	}
	
	
	public void d() {
		System.out.println("A-d function");
	}
	
	
}

class B extends A{

	@Override
	public int b() { // abstract 는 반드시 구현해야 함. 	
		return 10;
	}
	
	
}
