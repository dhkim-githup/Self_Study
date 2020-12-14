package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	
	/* 문서출력 첫번째 방법 
	@RequestMapping("index")
	public void index(HttpServletResponse response) throws IOException {		
		PrintWriter out = response.getWriter();
		out.println("Hello Index HttpServletResponse");
	}
	*/
	
	/*
	 * // 문서출력 두번째 방법 , ResponseBody
	 
	@RequestMapping("index")
	@ResponseBody
	public String index() {		
		return("Hello Index ResponseBody");
	}
	*/
	
	
	
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
