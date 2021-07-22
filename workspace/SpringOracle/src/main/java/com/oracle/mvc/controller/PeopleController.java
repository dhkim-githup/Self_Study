package com.oracle.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.mvc.service.PeopleServiceImpl;
import com.oracle.mvc.vo.People;

@RestController
public class PeopleController {
	
	@Autowired	
	PeopleServiceImpl peopleServiceImpl;
	
	
	@RequestMapping("insert")
	public String doInsert(HttpServletRequest request) {
		
		String strName = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		People people = new People(strName, age, null);
		
		peopleServiceImpl.doInsert(people);		
		return "insert";
	}
	
	@RequestMapping("select")
	public String doPeople() {
		
		String str="";
		
		List<People> list = peopleServiceImpl.getPeople();
		
		for(People p : list) {
			str = str+p.getName();
			str = str+p.getAge();
		}
		
		return str;
		
	}
	
	

}
