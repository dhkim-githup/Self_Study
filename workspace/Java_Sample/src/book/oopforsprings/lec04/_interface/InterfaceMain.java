package book.oopforsprings.lec04._interface;

public class InterfaceMain {

	public static void main(String[] args) {
		
		// Static area 
		System.out.printf("Your age is %s \n", Normal.age);
		System.out.printf("Your age is %s \n", Normal2.age2);
		
		Normal normal = new UseInterface();
			   normal.doHi();
		
		Normal2 normal2 = new UseInterface();
		        normal2.doHi2();
		
	}

}


// Normal interfacle class
interface Normal {
	
	int age = 10; // this is same public static int age = 10;
	
	void doHi(); // this is same public abstract void doHi();
	
}

//Mark static and abstract
interface Normal2 {
	
	public static int age2 = 20;
	
	public abstract void doHi2();
	
}

class UseInterface implements Normal, Normal2{

	@Override
	public void doHi() {
		System.out.println("HI ~~");		
	}

	@Override
	public void doHi2() {
		System.out.println("HI 2 ~~");	
		
	}
	
}