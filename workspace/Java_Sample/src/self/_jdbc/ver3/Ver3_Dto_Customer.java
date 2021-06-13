package self._jdbc.ver3;

/** 
 * Ver3. Data 저장 객체  
 * 계층간 데이터 교환을 위한 객체(Java Beans)이다
 * 
 */
public class Ver3_Dto_Customer {
	
	private String name;
	private int age;
	private String gender;
	private String reg_dati;
	
	
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
	public String getReg_dati() {
		return reg_dati;
	}
	public void setReg_dati(String reg_dati) {
		this.reg_dati = reg_dati;
	}

	
	
}
