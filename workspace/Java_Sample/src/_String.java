
public class _String  {

	public static void main(String[] args) {
		
	/* 리터럴 표현 , Heap 메모리 - string constant pool 를 이용한다. */
	String str1 = "홍길";
	System.out.printf("str1.hashcode %s \n", System.identityHashCode(str1));
	
	String str2 = "홍길";
	System.out.printf("str2.hashcode %s \n", System.identityHashCode(str2));
	
	String str3 = "홍길동";
	System.out.printf("str3.hashcode %s \n", System.identityHashCode(str3));
	
	       str2 = "홍길동";
	System.out.printf("str2.hashcode %s \n", System.identityHashCode(str2));
	
	System.out.println("---------------------------------------------------");
	
	/* new 객체 생성 , Heap 메모리 - 공간 할당 . */
	String nstr1 = new String("홍길");
	System.out.printf("nstr1.hashcode %s \n", System.identityHashCode(nstr1));
	
	String nstr2 = new String("홍길");
	System.out.printf("nstr2.hashcode %s \n", System.identityHashCode(nstr2));
	
	String nstr3 = new String("홍길동");
	System.out.printf("nstr3.hashcode %s \n", System.identityHashCode(nstr3));
	
	       nstr2 = "홍길동";
	System.out.printf("nstr2.hashcode %s \n", System.identityHashCode(nstr2));
	
	System.out.println("---------------------------------------------------");
	
	/* new 객체 생성 , Heap 메모리 - 공간 할당 . */
	StringBuffer sb1 = new StringBuffer("홍길");
	System.out.printf("sb1.hashcode %s \n", System.identityHashCode(sb1));
	
	StringBuffer sb2 = new StringBuffer("홍길");
	System.out.printf("sb2.hashcode %s \n", System.identityHashCode(sb2));
		
	       sb2.append("홍길동");
	System.out.printf("sb2.hashcode %s \n", System.identityHashCode(sb2));
	
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
	  
}
