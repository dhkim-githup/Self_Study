package com.study.beans.okbean.vo;

/**
 * 여기 데이타는 JspBeans 에서 사용한 값을 그대로 사용해본다.
 * @author PC
 *
 */
public class PersonVo2 {
	
	// 멤버변수 선언 (메서드 밖에 선언한다 )
		private String name;
		private int age;
		
		// 생성자 
		public PersonVo2() {
		}
		
		// get / set

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

}
