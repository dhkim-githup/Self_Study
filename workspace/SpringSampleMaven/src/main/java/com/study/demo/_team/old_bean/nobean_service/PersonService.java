package com.study.demo._team.old_bean.nobean_service;

import java.util.ArrayList;
import java.util.List;

import com.study.demo._team.old_bean.nobean_vo.PersonVo;

/* 
 * vo. PersonVo 에 데이타를 넣고 가져오는 기능을 한다.
 * -- 이런 작업을 삽질이라고 한다. 테스트를 위한 삽질
 */
public class PersonService {
	
	
	
	/* PersonVo 값을 계속 저장하귀 위해서는 static 사용 하면 됨 */
	private static List<PersonVo> list = new ArrayList<>();
	
	/* 컨트롤러에서 호출하는 메서드 */
	public List<PersonVo> getPersonList(){
		
		//List<PersonVo> list = new ArrayList<>();
		
		/* 데이타 세팅 , list 에 personVo 변수로 입력 */
		setAdd("홍길동",20);		
		setAdd("홍길순",30);		
		setAdd("홍길남",40);
		
		/* 잘 입력되었는지 체크 
		for(int i=0; i<list.size(); i++) {
			System.out.println("Service"+list.get(i).getName());
		}
		*/
		
		/* list 반환 - 컨트롤러에게 전달 */
		return list; 
	}
	
	/* 이름 , 나이 입력 */
	public void setAdd(String name, int age) {
		PersonVo personVo = new PersonVo();
		
		personVo.setName(name);
		personVo.setAge(age);
		
		list.add(personVo);
		
	}
	

}