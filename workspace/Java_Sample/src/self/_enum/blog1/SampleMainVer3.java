package self._enum.blog1;

import self._enum.blog1.SampleMainVer3.Type3;

/*
 *  enum 을 클래스안의 메서드로 선언하여 사용  
 *  다른 클래스에서 호출 시 해당 값을 import 하여 사용 
 */

public class SampleMainVer3 {
   
    public static void main(String[] qrgs) {
    	
    	Shoes3 shoes3 = new Shoes3();
         
        shoes3.name = "나이키";
        shoes3.size = 230;
                        
        System.out.println("신발 이름 = " + shoes3.name);
        System.out.println("신발 사이즈 = " + shoes3.size);
        System.out.println("신발 종류 = "+shoes3.type.RUNNING );
    }
    
    public enum Type3 {
        WALKING, RUNNING, TRACKING, HIKING   
    }
}

class Shoes3 {
    public String name;
    public int size;      
    public Type3 type;
}