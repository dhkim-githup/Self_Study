package book.oopforsprings.lec05.solid;

public class SRP남자_OK {	
}

class 남자{
	String myName ="남자";
}

class Son extends 남자 {
	void 효도하기() {
		System.out.println("엄마에게 효도");
	}
}

class Husband extends 남자{
	void 기념일챙기기() {
		System.out.println("아내에게 기념일 챙기기");
	}	
}

class Daddy extends 남자{
	void 용돈주기() {
		System.out.println("아이들에게 용돈주기");
	}
}

class Friend extends 남자{
	void 운동하기() {
		System.out.println("친구와 운동하기");
	}
}
