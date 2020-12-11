package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	public String index() {
		
		return "root.index";
	}	
	
	/*
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
	*/

}
