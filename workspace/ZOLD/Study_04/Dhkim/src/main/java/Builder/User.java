package Builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
	  private String name;
	  private int age;
	
	@Builder  
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	  
	  
	  /*
	  public static UserBuilder_bak builder() {
		  System.out.println("1");
	    return new UserBuilder_bak();
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
	  */
	}
