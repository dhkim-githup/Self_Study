package self._enum.blog1;

enum Type1 {
    WALKING, RUNNING, TRACKING, HIKING
}

/*
 *  enum 을 클래스로 선언하여 사용 
 */
public class SampleMainVer1 {
    public String name;
    public int size;
    public Type1 type;
     
    public static void main(String[] qrgs) {
    	SampleMainVer1 shoes = new SampleMainVer1();
         
        shoes.name = "나이키";
        shoes.size = 230;
        shoes.type = Type1.RUNNING;
         
        System.out.println("신발 이름 = " + shoes.name);
        System.out.println("신발 사이즈 = " + shoes.size);
        System.out.println("신발 종류 = " + shoes.type);
        
        
    }
}