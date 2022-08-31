package book.oopforsprings.lec04._final;

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		
	}

}

class Cat {
	
	final static int age=10;
	final static int age2;
	
	final int weight=20;
	final int weight2;

	// static 은 static 블록에서만 변경 가능
	static {
		// age=11; 최초 초기값이 있는 변수는 값을 받지 못함
		age2=21; // 상수 초기화 가능
	}
	
   // 아래는 오류 발생.
	public Cat() {
		//weight=11; // final 상수의 변경은 허용되지 않음
		weight2=21;  // 
	}
}