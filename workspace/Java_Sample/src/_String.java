
public class _String  {

	public static void main(String[] args) {
		
		_String s = new _String();
		
		String str1="aa";
		System.out.println("str1 =>"+str1.toString()+","+str1.hashCode());
		
		
	
		int i1=0;
		int i2=2;
		
		Integer intg = 2;
		
		
		
		System.out.println(intg.equals(i2));
		System.out.println(i1 == intg);
		
		System.out.println("int"+ (i1+i2));	
		
		System.out.println(s.toString());
		
		String str2 = new String("java");
		String str3 = str2;
		String str4 = new String("java");
		
		System.out.println(str2.hashCode()+","+System.identityHashCode(str2));
		System.out.println(str3.hashCode()+","+System.identityHashCode(str3));
		System.out.println(str4.hashCode()+","+System.identityHashCode(str4));
		
		System.out.println(str2.equals(str4));
		
	}

	@Override
	public String toString() {
		return "_String [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
	  
}
