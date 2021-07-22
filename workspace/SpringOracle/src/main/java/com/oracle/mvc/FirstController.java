package com.oracle.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping("/Hello")
	public String doHi() {
		
		return "Hello World";
		
	}

}
