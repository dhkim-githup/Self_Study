package Inheritance;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal() {		
	}
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;		
	}

	// 나를 소개하지 
	public void doShowMe(String name, int age) {
		System.out.printf("내 이름은 %s , 내 나이는 %d \n", name, age);
	}	
	
	// 먹다
	public void doEat(String food) {
		System.out.printf("%s 을 먹는다. \n", food);
	}
	
}
