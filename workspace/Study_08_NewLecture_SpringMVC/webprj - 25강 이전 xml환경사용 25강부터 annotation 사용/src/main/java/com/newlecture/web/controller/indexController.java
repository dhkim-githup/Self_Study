package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class indexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "Hello Spring MVC ~ ");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		//mv.setViewName("index");
		mv.setViewName("root.index"); // tiles 를 사용하기 위한 방법 
		
		
		return mv;
		
	}

}
