package book.oopforsprings.lec06.templatemethodpattern;

public class Driver {
	public static void main(String[] args) {
		Animal bolt = new Dog2();
		Animal kitty = new Cat2();

		bolt.playWithOwner();

		System.out.println();
		System.out.println();

		kitty.playWithOwner();
	}
}