package self._enum.blog1;

public class Sample_Get {
	
	public static void main(String[] args) {
        
				
		for(Type7 type : Type7.values()){
			System.out.printf("Shoes %s , Shoes Size %s , Shoes Size %d \n",type, type.getName(), type.getSize()); 
			
			
			System.out.println(type.name); // public(defalut) 선언으로 사용 가능
			//System.out.println(type.size); // private 으로 접근 불가 
        }    
		
		
    }

}

enum Type7 {
    // 상수("연결할 문자")
    WALKING("나이키",240), RUNNING("아디다스",250) , TRACKING("프로스펙스",260), HIKING("블랙야크",270);
     
	/* 아래를 public 으로 사용하여 외부에서 직접 접근할 수 있으나, 
	 * 아래와 같이 public 함수를 사용하는것이 바람직해 보임	 
	 * 아래 public String name 은 위 구문에서 type.name 으로도 접근이 가능함
	 */
    String name;
    final private int size;
     
    private Type7(String name, int size) { //enum에서 생성자 같은 역할
        this.name = name;
        this.size = size;
    }   
    
    public String getName() { // 
        return name;
    }
    
    public int getSize() { // 문자를 받아오는 함수
        return size;
    }
    
}