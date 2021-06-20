
public class _String {

	public static void main(String[] args) {
		
		String str1="aa";
		System.out.println("str1 =>"+str1.hashCode());
	
		String str2="aa";
		System.out.println("str2 =>"+str2.hashCode());
	
		//System.out.println(str1==str2);
		
		String s1=new String("aa");
		String s2=new String("aa");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(str1==s2);
		System.out.println(str1.equals(s2));
		
		
		
		
		
		int i1=0;
		int i2=2;
		int i3=2;
		//System.out.println(i2==i3);
		
		
	}
	
	  
}
