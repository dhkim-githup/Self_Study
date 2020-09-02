package com.study01.spring.ver2;

/* - 자녀들의 공통 속성이 있다. */
public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 이번주는 누가 집에 올거니? */
		
		/* 첫째가요 */
		//Children children = new FirstBaby();
		
		/* 둘째가요 */
		Children children = new SecondBaby();
		
		/* 첫째든 둘째든 상관없어.. 누구든지 보내줘... 
		 * DI - 이것이 의존성 
		 */
		Console console = new Console(children);
		
		console.consoleOut();
			
		

	}		
}

