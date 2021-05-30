package self._enum.blog1;

/*
 *  enum 을 클래스안의 메서드로 선언하여 사용  
 */
public class SampleMainVer2 {
         
    public static void main(String[] qrgs) {
    	
    	Shoes2 shoes2 = new Shoes2();
         
        shoes2.name = "나이키";
        shoes2.size = 230;
                 
        System.out.println("신발 이름 = " + shoes2.name);
        System.out.println("신발 사이즈 = " + shoes2.size);
        System.out.println("신발 종류 = " + shoes2.type.RUNNING);
    }
}

class Shoes2 {
    public String name;
    public int size;
    public Type2 type;
    
    public enum Type2 {
        WALKING, RUNNING, TRACKING, HIKING   
    }
}