package com.study.comm.vo;

/*
 * 가입하는 회원의 정보를 저장해주는 멤버변수들.
 * 이 값을 통해  클라이언트에 내용을 model 을 통해 전달해 줄 수 있다.
 */
public class Members {
	
	private String strName ;
	private int intAge ;
	private String strMobile;
	
	
	/*
	 *  이클립스 , 우버튼, source - Generate 를 통해 아래 생성자, get / set 자동생성 
	 *  lombok 은 아래 내용을 자동으로 만들어주는 기능을 가지고 있음. (알고 있는것이 중요함)
	 */
	
	public Members(String strName, int intAge, String strMobile) {
		super();
		this.strName = strName;
		this.intAge = intAge;
		this.strMobile = strMobile;
	}


	public String getStrName() {
		return strName;
	}


	public void setStrName(String strName) {
		this.strName = strName;
	}


	public int getIntAge() {
		return intAge;
	}


	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}


	public String getStrMobile() {
		return strMobile;
	}


	public void setStrMobile(String strMobile) {
		this.strMobile = strMobile;
	}
	
	

}