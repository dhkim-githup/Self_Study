package Data;

public class GetSet {
	
	public static void main(String[] args) {
		
		GetSetClass gsc = new GetSetClass();
		
		gsc.setName("³ª¾ß³ª");
		
		System.out.println(gsc.getName());
	}
	
	
	}

class GetSetClass {
	private String name;
	private int age;
	
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
}