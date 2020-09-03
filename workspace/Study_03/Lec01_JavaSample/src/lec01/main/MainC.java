package lec01.main;

import lec01.app.*;


public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 계산하는 객체 
		MyCal mycal = new MyCal(5,10, new CalMulti());
		
		mycal.result();	
		
		
		// 결과값 출력 
		

	}

}
