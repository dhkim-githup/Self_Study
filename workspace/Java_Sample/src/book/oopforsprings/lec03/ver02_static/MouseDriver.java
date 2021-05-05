package book.oopforsprings.lec03.ver02_static;

public class MouseDriver {

	public static void main(String[] args) {
		
		Mouse mickey = new Mouse();
		Mouse jerry = new Mouse();
		Mouse mightyMouse = new Mouse();
		
		Mouse.countOfTail =3;
		
		System.out.printf("mickey Tail : %s \n", mickey.countOfTail);
		System.out.printf("jerry Tail : %s \n", jerry.countOfTail);
		System.out.printf("mightyMouse Tail : %s \n", mightyMouse.countOfTail);
		
		System.out.printf("Mouse Tail : %s \n", Mouse.countOfTail);
		
	}

}
