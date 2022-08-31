package book.oopforsprings.lec04._instanceof;

public class SampleMain {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		Bird eagle = new Eagle();
		Sparrow sparrow = new Sparrow();
		IfFly ifFly = new Eagle();
		
		// Class Type
		System.out.printf("1. bird %s \n", bird instanceof Bird);
		
		System.out.println("-----------------");
		
		// Super class , My Class
		System.out.printf("2. eagle %s \n", eagle instanceof Bird);
		System.out.printf("2. eagle %s \n", eagle instanceof Eagle);
		
		System.out.println("-----------------");
		
		// my Class , Super Class
		System.out.printf("3. sparrow %s \n", sparrow instanceof Sparrow);
		System.out.printf("3. sparrow %s \n", sparrow instanceof Bird);
		
		System.out.println("-----------------");
		
		// interface Class, my Class , other Class
		System.out.printf("4. ifFly %s \n", ifFly instanceof IfFly);
		System.out.printf("4. ifFly %s \n", ifFly instanceof Eagle);
		System.out.printf("4. ifFly %s \n", ifFly instanceof Sparrow);

		System.out.println("-----------------");
		
		// all of Object
		System.out.printf("1. bird %s \n", bird instanceof Object);
		System.out.printf("2. eagle %s \n", eagle instanceof Object);
		System.out.printf("4. sparrow %s \n", sparrow instanceof Object);
		System.out.printf("4. ifFly %s \n", ifFly instanceof Object);
	}

}

// Super
class Bird{	
}

class Sparrow extends Bird implements IfFly{	
	@Override
	public void fly() {	}	
}

class Eagle extends Bird implements IfFly{
	@Override
	public void fly() {	}	
}

// Interface
interface IfFly{
	void fly();
}