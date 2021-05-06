package com.prj.mvc2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/Hello")
	public String doHi() {
		
		return "Hello World";
		
	}

}
