package sample;

public class IntroMe {
	
	public String name;
	public int age;
	public String home;
	
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
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	@Override
	public String toString() {
		return "IntroMe [name=" + name + ", age=" + age + ", home=" + home + "]";
	}
	
	
	
}
