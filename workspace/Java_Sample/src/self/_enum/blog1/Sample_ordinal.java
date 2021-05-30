package self._enum.blog1;

public class Sample_ordinal {
	
	public String name;
    public int size;
    public Type5 type;
     
    public static void main(String[] args) {
    	Sample_ordinal shoes = new Sample_ordinal();
         
        shoes.name = "나이키";
        shoes.size = 230;
        shoes.type = Type5.WALKING;
         
        /*
         * ordinal(). 원소에 열거된 순서를 정수 값으로 반환 (0부터 반환
         */
        System.out.println(shoes.type.ordinal());
         
        Type5 tp = Type5.HIKING;
         
        System.out.println(tp.ordinal());
    }

}


enum Type5 {
    WALKING, RUNNING, TRACKING, HIKING;
}