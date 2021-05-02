package singleton.ver1;

public class NaSingleClass {
	
	private String strName;
	
	// 클래스 참조 변수 선언 
	// 해당 값을 static 으로 선언하여, 메모리에 올려, 모두가 참조하게 함(포인터)
	private static NaSingleClass singleInstance;
	
	// 생성자가 private , new 접근 할 수 없음
	private NaSingleClass() {		
	}
	
	// 해당 함수를 통해서만, 객체화가능,,,
	//public static NaSingleClass getSingleInstance() {
	//public static synchronized NaSingleClass getSingleInstance() {
	public static synchronized NaSingleClass getSingleInstance() {		
		if(singleInstance ==null) {
			synchronized (NaSingleClass.class) {
				if(singleInstance ==null) {
					singleInstance = new NaSingleClass();
				}
			}			
		}
		return singleInstance;
	}
	
	public String getStrName() {
		return strName;
	}
	
	public void setStrName(String strName) {
		this.strName = strName;
	}
	

}
