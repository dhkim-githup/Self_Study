package abstrtact.lifecoding;

public class AbstractMain {

	public static void main(String[] args) {
		System.out.println("========= AbstractMain ==============");
		
		
		NormalC normalc = new NormalC();
		normalc.normalM();
		System.out.println(normalc.abstractM());		
	}
}


 abstract class AbstractC{
	
	public abstract int abstractM(); // 구현되지 않은 정의만 됨.
	
	//public abstract int c() { // Abstract methods do not specify a body
	public  int getWhat() { // Abstract methods do not specify a body
		int a=10;
		return a;
	}
	
	
	public void normalM() {
		System.out.println("A-d function");
	}
		
}

class NormalC extends AbstractC{

	@Override
	public int abstractM() { // abstract 는 반드시 구현해야 함. 	
		return 10;
	}
	
	
}
