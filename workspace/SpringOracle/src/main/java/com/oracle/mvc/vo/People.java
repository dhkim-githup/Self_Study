package com.oracle.mvc.vo;

public class People {

	private String name;
	private int    age;
	private String reg_dati;
	
	public People(String name, int age, String reg_dati) {
		super();
		this.name = name;
		this.age = age;
		this.reg_dati = reg_dati;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReg_dati() {
		return reg_dati;
	}

	public void setReg_dati(String reg_dati) {
		this.reg_dati = reg_dati;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", reg_dati=" + reg_dati + "]";
	}
	
	
}
