package com.study.beans.nobean.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.beans.nobean.service.PersonService;
import com.study.beans.nobean.vo.PersonVo;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String personList(Model model) {
		model.addAttribute("test", "modelString");
		
		// 1. 서비스 호출 
		PersonService personService = new PersonService();
		List<PersonVo> list = personService.getPersonList();
		
		/* 값이 잘 나왔는지 체크 
		for(PersonVo person : list) {
			System.out.println(person.getName());
		}
		*/
		
		// 2. 리턴값으로  model 에 List 전달 
		model.addAttribute("personList",list);
				
		//return "/WEB-INF/view/personlist.jsp";
		return "personlist";
	}
}
