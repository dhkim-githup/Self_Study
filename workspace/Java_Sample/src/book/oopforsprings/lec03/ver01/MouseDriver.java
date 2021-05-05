package book.oopforsprings.lec03.ver01;

public class MouseDriver {

	public static void main(String[] args) {
		
		Mouse mickey = new Mouse();
		
		mickey.name = "Mickey";
		mickey.age  = 85;
		mickey.countOfTail = 1;
		
		mickey.sing();
		
		Mouse jerry = new Mouse();
		
		jerry.name = "Jerry";
		jerry.age  = 30;
		jerry.countOfTail = 1;
		
		jerry.sing();
		
		

	}

}
