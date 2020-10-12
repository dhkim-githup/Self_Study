package com.study.ver2;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �а� 
		Children fb = new FirstBaby();
		Children sb = new SecondBaby();
		
		System.out.println("첫째 =>"+fb.getName());
		System.out.println("첫째 =>"+fb.getAge());
		
		System.out.println("==================================================");
		
		System.out.println("둘째 =>"+sb.getName());
		System.out.println("둘째 =>"+sb.getAge());
				
		
		System.out.println("==================================================");
		
		Console con = new Console(sb);
		con.consoleOut();
	
		

	}

}
