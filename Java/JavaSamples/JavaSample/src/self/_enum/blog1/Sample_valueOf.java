package self._enum.blog1;

public class Sample_valueOf {
	
	 public static void main(String[] args) {
	        Type6 tp1 = Type6.WALKING;
	        
	        /*
	         * valueOf() : 매개변수로 주어진 String과 열거형에서 일치하는 이름을 갖는 원소를 반환
			 *    	       (주어진 String과 일치하는 원소가 없는 경우 IllegalArgumentException 예외 발생)
	         */
	        
	        Type6 tp2 = Type6.valueOf("WALKING");
	         
	        System.out.println(tp1);
	        System.out.println(tp2);
	    }

}


enum Type6 {
    WALKING, RUNNING, TRACKING, HIKING;
}