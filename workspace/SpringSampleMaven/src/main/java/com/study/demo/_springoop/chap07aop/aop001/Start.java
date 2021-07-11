package com.study.demo._springoop.chap07aop.aop001;

public class Start {
	
	public static void main(String[] args) {
		Boy romeo 	= new Boy();
		Girl juliet = new Girl();
		
		romeo.runSomething();
		
		System.out.println();
		
		juliet.runSomething();
	}

}
