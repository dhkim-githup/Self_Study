package book.oopforsprings.lec05.solid;

public class OCP운전자_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		소나타2 운전자 = new 소나타2();
		  운전자.drive();
		
		그랜저2 운전자2 = new 그랜저2();
		  운전자2.drive();
		
		BMW2 운전자3 = new BMW2();
		  운전자3.drive();
	}

}

class 소나타2{	
	void drive() {
		System.out.println("나는 소나타를 운전한다.");
	}
}

class 그랜저2{	
	void drive() {
		System.out.println("나는 그랜저를 운전한다.");
	}
}

class BMW2{	
	void drive() {
		System.out.println("나는 BMW를 운전한다.");
	}
}