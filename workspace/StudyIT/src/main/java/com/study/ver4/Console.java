package com.study.ver4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/* 화면에 출력만 해줄게 */
public class Console {
	
/* 자식 Interface 정의, */
	
	//@Autowired // annotaion on Spring , 우선순위 type -> id
	//@Resource // annotation on Java , 우선순위 id -> type
	
	@Autowired
	@Qualifier("baby")
	Children children;
	
	/* 생성자에서 자식을 받음 
	 * 객체를 주입 받음. Insection
	 * */
	/*
	public Console(Children children) {		
		this.children = children;
	}
	*/
	
	


	public void consoleOut() {
		
		System.out.println("Consle Start ");
		
		System.out.println("Name=>"+children.getName());
		System.out.println("Age=>"+children.getAge());
	}

}
