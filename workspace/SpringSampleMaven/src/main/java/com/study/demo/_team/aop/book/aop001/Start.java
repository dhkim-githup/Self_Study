package com.study.demo._team.aop.book.aop001;

public class Start {
	
	public static void main(String[] args) {
		Boy romeo 	= new Boy();
		Girl juliet = new Girl();
		
		romeo.runSomething();
		
		System.out.println();
		
		juliet.runSomething();
	}

}
