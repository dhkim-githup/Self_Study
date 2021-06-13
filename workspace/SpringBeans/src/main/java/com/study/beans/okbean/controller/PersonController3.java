package com.study.beans.okbean.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.beans.okbean.service.PersonService2;
import com.study.beans.okbean.service.PersonService3;
import com.study.beans.okbean.vo.PersonVo2;

@Controller
public class PersonController3 {

	
	//@Lazy // 지연로딩을 위한 빈 정의 와 @Autowired가 사용되는 두 곳 모두 @Lazy 가 사용되어야 한다
	@Autowired
	@Qualifier("PersonService3")	
	PersonService3 personService3; // 객체 참조변수를 빈에서 할당 받음
	
	/* scope Test 를 위한 ApplicationContext 선언 */
	@Autowired
	ApplicationContext ctx;
	
	/* 생성자 위치 */
	public PersonController3() {
		System.out.println("PersonController2 Constructor ");
	}
		
	
	@RequestMapping("person3")
	public String personList3(Model model) {
		model.addAttribute("test", "modelString");
		
		/* prototype 일 경우 객체의 주소 체크 */
		PersonService3 p3_1 = ctx.getBean(PersonService3.class);
		PersonService3 p3_2 = ctx.getBean(PersonService3.class);
		
		System.out.println("personService3 : Address p3_1 => "+p3_1);
		System.out.println("personService3 : Address p3_2 => "+p3_2);
		
		System.out.println("personService3 : Address personService3 => "+personService3);
		// 1. 서비스 호출 
		//PersonService2 personService2 = new PersonService2();
		List<PersonVo2> list = personService3.getPersonList();
		
		/* 값이 잘 나왔는지 체크 
		for(PersonVo person : list) {
			System.out.println(person.getName());
		}
		*/
		
		// 2. 리턴값으로  model 에 List 전달 
		model.addAttribute("personList3",list);
				
		//return "/WEB-INF/view/personlist.jsp";
		return "personlist3";
	}
	
}
