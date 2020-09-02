package com.study01.spring.ver2;

/* 화면에 출력만 해줄게 */
public class Console {
	
	/* 자식 Interface 정의, */
	Children children;
	
	/* 생성자에서 자식을 받음 
	 * 객체를 주입 받음. Insection
	 * */
	public Console(Children children) {		
		this.children = children;
	}


	public void consoleOut() {
		
		System.out.println("Consle Start ");
		
		System.out.println("Name=>"+children.getName());
		System.out.println("Age=>"+children.getAge());
	}

}
