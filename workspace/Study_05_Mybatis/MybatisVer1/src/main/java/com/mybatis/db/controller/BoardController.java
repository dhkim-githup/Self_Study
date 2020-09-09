package com.mybatis.db.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybatis.db.service.BoardServiceImpl;

@Controller
public class BoardController {
	
	@Resource(name="service")
	private BoardServiceImpl boardServiceImpl;
	
	@RequestMapping("list")
	public String list(Map<String,Object> map, Model model) {
	  List<Map<String, Object>> list = new ArrayList<Map<String,Object>>() ;
	  list = boardServiceImpl.list(map);
	  model.addAttribute("list",list);
		return "board/list";
	}

}
