package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.IfNoticeService;

public class ListController implements Controller {
	
	
	private IfNoticeService noticeService;
	
	// Bean 을 사용 - noticeService
	public void setNoticeService(IfNoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
			
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "Hello Spring MVC ~ ");
		//mv.setViewName("notice/list");
		mv.setViewName("notice.list");
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);				
		
		return mv;
	}

}
