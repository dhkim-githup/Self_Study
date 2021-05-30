package team._stream.youtube1;

import java.util.Arrays;
import java.util.List;

public class People {

	private String name;
	private int age;
	private String gender;
	
	
	
	public People(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	public static List<People> getPeopleList(){
		
		/*
		 * Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
		 * java.util.ArrayList 클래스와는 다른 클래스이다.
		 * java.util.Arrays.ArrayList 클래스는 set(), get(), contains() 메서드를 가지고 있지만
		 * 원소를 추가하는 메서드는 가지고 있지 않기 때문에 사이즈를 바꿀 수 없다.
		 */
		return Arrays.asList(				
					new People("홍길동", 15, "Male"),
					new People("홍길순", 16, "Female"),
					new People("홍길학", 17, "Male"),
					new People("홍길자", 18, "Female")
					);
		
	}
	
}
