package book.oopforsprings.lec06.decoratorPattern;

public class ClientWithDecolator {
	
	public static void main(String[] args) {
		IService decorator = new Decorator();
		System.out.println(decorator.runSomething());
	}

}
