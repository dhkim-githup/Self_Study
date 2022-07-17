package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class Login {

    @GetMapping("/login")
    public String doStudy_reg(){
        return "/login/login";
    }

    @GetMapping("/member_join")
    public String doMember_join(){
        return "/login/member_join";
    }
}
