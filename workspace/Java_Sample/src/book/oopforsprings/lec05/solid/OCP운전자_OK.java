package book.oopforsprings.lec05.solid;

public class OCP운전자_OK {

	public static void main(String[] args) {
		
		자동차[] 운전자 = new 자동차[3];
		
		운전자[0] = new 소나타();
		운전자[1] = new 그랜저();
		운전자[2] = new BMW();
		
		for(int i=0; i<운전자.length; i++) {
			운전자[i].drive();
		}

	}

}

class 자동차{
	String myCar="자동차";
	void drive() {
		System.out.printf("나는 %s 를 운전할 수 있다. \n",  myCar);
	}
}

class 소나타 extends 자동차{
	public 소나타() {
		myCar = "소나타";
	}	
}

class 그랜저 extends 자동차{	
	public 그랜저() {
		myCar = "그랜저";
	}
}

class BMW extends 자동차{	
	public BMW() {
		myCar = "BMW";
	}
}