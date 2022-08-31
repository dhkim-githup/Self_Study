package team._singleton.ver1;

/**
 * This is javadoc  by dhkim - NormalMain
 * @author KimDongHyun - Iteam
 * @since  2021.05.18
 */

public class NormalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = new String("HongGilDon");
		strName="a";
		strName="b";
		
		StringBuffer bf = new StringBuffer("Buffer");
		bf.append("AA");
		bf.append("BB");
		
		
		int intAge = 20;
		
		doPrint(strName, intAge);
		
		StaticObj obj = new StaticObj();
		
		String strNameGlobal2 = StaticObj.strNameGlobal;
		
		System.out.println("\n\n"+strNameGlobal2);
		
	}
	
	public static void doPrint(String name, int age) {
		String myName;
		int myAge;
		
		myName = name;
		myAge  = age;
		
		System.out.printf("My Name %s , My Age %d", myName, myAge);		
	}
}

class StaticObj {
	
	public static String strNameGlobal="SingleKim";
	
	int intObj =100;
		
	public StaticObj() {	
		System.out.println("\n Print Herer?");
	}	
	
	public String getStrName() {
		return strNameGlobal;
	}
	
	public void setStrName(String strName) {
		this.strNameGlobal = strName;
	}	

}

