package Data;

import lombok.Data;

public class GetSetData {
	
	public static void main(String[] args) {
		
		GetSetClassData gsc = new GetSetClassData();
		
		gsc.setName("³ª¾ß³ª");
		
		System.out.println(gsc.getName());
	}
	
	
	}

@Data
class GetSetClassData {
	private String name;
	private int age;
	
	
}