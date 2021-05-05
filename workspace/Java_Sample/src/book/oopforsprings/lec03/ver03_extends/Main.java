package book.oopforsprings.lec03.ver03_extends;

public class Main {

	public static void main(String[] args) {
		
		Human human = new Human();
			System.out.printf("myClass : %s \n", human.strClass);
			human.strWho = "Human";
			human.doSing();
			human.doDo();
			
		Animal human2 = new Human();
			System.out.printf("myClass : %s \n", human2.strClass);
			human.doSing();
			//(X) human2.strWho = "Human";
			// human2.doDo(); 
			/* 모든 참조 변수는 앞에 있는 클래스의 속성을 따라간다.
			 *  생성된 Animal 객체는 human 에 있는 값중 자기에게 속한 값만을 가져온다.
			 *  Animal 객체는  추상적인 클래스이기 때문에 new Animal() 의 의미가 없다.
			 */

	}

}

class Animal{
	
	String strClass;
	
	public Animal() {
		this.strClass="Animal";
	}
	
	public void doSing() {		
	}
}

class Human extends Animal{
	String strWho;
	
	public Human() {
		this.strClass="Animal";
	}
	
	@Override
	public void doSing() {
		System.out.println("Human Singing ~~");
	}	
	
	public void doDo() {
		System.out.println("Nothing");
	}
}