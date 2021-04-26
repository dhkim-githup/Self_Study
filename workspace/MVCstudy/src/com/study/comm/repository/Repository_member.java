package com.study.comm.repository;

import java.util.*;

import com.study.comm.vo.Members;

/*
 * 여기도 이해하기가 어려웠지만,,,,
 * Member 에 있는 값들은 저장하고, 꺼내는 역할을 하는 곳이다.
 * Member 와 같이 코딩해도 되지만, 분리함으로써 재사용등의 효과를 얻는다.
 */
public class Repository_member {
	
	/*
	 * 이부분이 중요한데, Member 의 값들을 객체로해서 저장하여 클라이언트에 넘겨준다.  
	 * 일반적으로 List 에 Map 을 넣어서 값을 보관한다.
	 * 여기서는 단순하게 List 만 사용하여 구현
	 * 선업을 static 으로 하는 이유는 단지, 결과값을 보기 위해서임. DB 를 사용한다면, 굳이 사용 안해도 됨, 하지만 지금 단계에선 사용
	 */
     private static List<Members> list = new ArrayList<>();  
	
	/*
	 * Members 의 값을 가지고 있는 객체를 인자로 받는다.
	 *  멤버를 저장한다 
	 */
	public void setSave(Members members) {
		System.out.println("========= setSave ===========");		
		list.add(members);
	}
	
	/* Save 를 통해 가지고 있는 값들을 그대로 return */
	public List<Members> getList(){
		System.out.println("========= getList ===========");
		return list;
	}

}