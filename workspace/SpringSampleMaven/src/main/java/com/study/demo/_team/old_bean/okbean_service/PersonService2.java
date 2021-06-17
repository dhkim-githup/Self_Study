package com.study.demo._team.old_bean.okbean_service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.study.demo._team.old_bean.okbean_vo.PersonVo2;

/* 
 * vo. PersonVo 에 데이타를 넣고 가져오는 기능을 한다.
 * -- 이런 작업을 삽질이라고 한다. 테스트를 위한 삽질
 */
@Lazy //지연로딩을 위한 빈 정의 와 @Autowired가 사용되는 두 곳 모두 @Lazy 가 사용되어야 합니다.
@Service
@Qualifier("PersonService2")
@Scope("singleton") // singleton,  prototype  
public class PersonService2 {
	
	/* PersonVo 값을 계속 저장하귀 위해서는 static 사용 하면 됨 */
	private static List<PersonVo2> list2 = new ArrayList<>();
	
	/* 생성자 위치 */
	public PersonService2() {
		System.out.println("PersonService2 Constructor ~");
	}
	
	/* 스프링 시작시  빈이 생성된 후 실행시킨다. 의존성 주입이 완료된 후 실행되는 초기화 메서드
	 * XML - init-method 옵션
	 *  */
	@PostConstruct
    public void init() {
      System.out.println("PersonService2 @PostConstruct ~");
    }
	
	/* 컨트롤러에서 호출하는 메서드 */
	public List<PersonVo2> getPersonList(){
		
		//List<PersonVo> list = new ArrayList<>();
		
		/* 데이타 세팅 , list 에 personVo 변수로 입력 */
		setAdd("홍길동2",20);		
		setAdd("홍길순2",30);		
		setAdd("홍길남2",40);
		
		/* 잘 입력되었는지 체크 
		for(int i=0; i<list.size(); i++) {
			System.out.println("Service"+list.get(i).getName());
		}
		*/
		
		/* list 반환 - 컨트롤러에게 전달 */
		return list2; 
	}
	
	/* 이름 , 나이 입력 */
	public void setAdd(String name, int age) {
		PersonVo2 personVo = new PersonVo2();
		
		personVo.setName(name);
		personVo.setAge(age);
		
		list2.add(personVo);
		
	}
	
	
	/* 서버가 종료될때 실행된다. 
	 * XML - destroy-method 옵션
	 * */
	@PreDestroy
	public void destroy(){
	    System.out.println("@PreDestroy!!");       
	}

}