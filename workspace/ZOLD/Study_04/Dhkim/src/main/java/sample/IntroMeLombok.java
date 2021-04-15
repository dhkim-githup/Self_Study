package sample;

import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

//@Setter
@Data
public class IntroMeLombok {
	
	@NonNull
	public String name;
	public int age;
	public String home;
	
	public IntroMeLombok(String name, int age, String home) {
		super();
		this.name = name;
		this.age = age;
		this.home = home;
	}
	
	
	
	
}
