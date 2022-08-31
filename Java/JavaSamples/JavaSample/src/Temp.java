
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("java");
		
		String str2 = new String("java");
		
		String str3 = str2;
		
		String str4 = "java";
		
		String str5 = "java";
		
		System.out.printf("str :  %s , str2 : %s, str3 : %s \n", str1.hashCode(), str2.hashCode(), str3.hashCode());
		
		System.out.println(str1);
		System.out.printf("str1==str2 : %s \n" , str1==str2);
		System.out.printf("str1==str3 : %s \n" , str1==str3);
		System.out.printf("str2==str3 : %s \n" , str2==str3);
		System.out.printf("str3==str4 : %s \n" , str3==str4);
		System.out.printf("str4==str5 : %s \n" , str4==str5);
		
		System.out.println("break");
		
		str1.equals(str2);
		
		String custnm="";
		custnm=null;
		
		if(custnm!=null && !"".equals(custnm)){ System.out.println("Hi"); 
		}else{ System.out.println("Hi-2");  }
		

	}

}
