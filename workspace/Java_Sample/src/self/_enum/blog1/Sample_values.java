package self._enum.blog1;

public class Sample_values {
	
	public String name;
    public int size;
    public Type4 type;
     
    public static void main(String[] args) {
    	
    	/*
    	 *  eum의 요소들을 순서대로 enum타입의 배열로 리턴. 
    	 *  열거된 모든 원소를 배열에 담아 순서대로 반환
    	 */
    	
        for(Type4 type : Type4.values()) {
            System.out.println(type);
        }
        
        /*
         * length 사용 가능 
         */
        System.out.println(Type4.values().length);
       
    }

}

enum Type4 {
    WALKING4, RUNNING4, TRACKING4, HIKING4;
}