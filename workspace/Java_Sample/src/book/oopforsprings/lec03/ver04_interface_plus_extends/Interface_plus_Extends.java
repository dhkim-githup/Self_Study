package book.oopforsprings.lec03.ver04_interface_plus_extends;

/* 
 * The collaboration of Interface and Extends  
 * 2021.05.06 Goinmul
 */
public class Interface_plus_Extends {

	public static void main(String[] args) {
		
		IfFly bat = new Bat();
			bat.fly();
			
		IfFly sparrow = new Sparrow();
			sparrow.fly();
			
		/* Use Array */		
		IfSwim ifswim[] = new IfSwim[2];	
			ifswim[0] = new Whale();
			ifswim[1] = new Penguin();
			
		for(IfSwim array_swim: ifswim) {
			array_swim.swim();
		}

	}
}

/* Super Class */
class Animal{
	String myClass;
	
	public Animal() {
		myClass = "Animal";
	}
}

/* Interface */
interface IfFly {
	void fly();
}

/* Interface */
interface IfSwim{
	void swim();
}

/* Inheritance */
class Mammal extends Animal{
	public Mammal() {
		myClass = "Mammal";
	}
}

/* Inheritance */
class Bird extends Animal{
	public Bird() {
		myClass = "Bird";
	}	
}

/* Collaboration */
class Whale extends Mammal implements IfSwim{
	
	public Whale() {
		myClass = "Whale";
	}

	@Override
	public void swim() {
		System.out.println(myClass + " -> Swimming ... ");		
	}	
}

/* Collaboration */
class Bat extends Mammal implements IfFly{
	
	public Bat() {
		myClass = "Bat";
	}

	@Override
	public void fly() {
		System.out.println(myClass + " -> Flying ... ");		
	}	
}

/* Collaboration */
class Sparrow extends Bird implements IfFly{
	
	public Sparrow() {
		myClass = "Sparrow";
	}

	@Override
	public void fly() {
		System.out.println(myClass + " -> Flying ... ");		
	}	
}

/* Collaboration */
class Penguin extends Bird implements IfSwim{
	
	public Penguin() {
		myClass = "Penguin";
	}
	
	@Override
	public void swim() {
		System.out.println(myClass + " -> Swimming ... ");		
	}
}





