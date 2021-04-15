package test.di.vo;

import lombok.Builder;
import lombok.Getter;

// 빌더 패턴 
@Getter
public class BreadVo3 {
	
	public String name;
	public int age;
	
	@Builder
	public BreadVo3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
