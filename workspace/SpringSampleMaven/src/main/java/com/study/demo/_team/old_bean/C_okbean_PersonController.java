package com.study.demo._team.old_bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.demo._team.old_bean.okbean_service.PersonService2;
import com.study.demo._team.old_bean.okbean_vo.PersonVo2;

@Controller
public class C_okbean_PersonController {

	@Lazy // 지연로딩을 위한 빈 정의 와 @Autowired가 사용되는 두 곳 모두 @Lazy 가 사용되어야 한다 
	@Autowired
	@Qualifier("PersonService2")
	PersonService2 personService2; // 객체 참조변수를 빈에서 할당 받음 
	
	/* 생성자 위치 */
	public C_okbean_PersonController() {
		System.out.println("PersonController2 Constructor ");
	}
	
	@RequestMapping("/person2")
	public String personList(Model model) {
		model.addAttribute("test", "modelString");
		
		// 1. 서비스 호출 
		//PersonService2 personService2 = new PersonService2();
		List<PersonVo2> list = personService2.getPersonList();
		
		/* 값이 잘 나왔는지 체크 
		for(PersonVo person : list) {
			System.out.println(person.getName());
		}
		*/
		
		// 2. 리턴값으로  model 에 List 전달 
		model.addAttribute("personList2",list);
				
		//return "/WEB-INF/view/personlist.jsp";
		return "old_bean/okbean_personlist2";
	}
	
}