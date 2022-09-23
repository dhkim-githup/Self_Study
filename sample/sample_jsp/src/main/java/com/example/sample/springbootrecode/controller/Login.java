package com.example.sample.springbootrecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springbootrecode/login")
public class Login {

    @GetMapping("/login")
    public String doStudy_reg(){
        return "/springbootrecode/login/login";
    }

    @GetMapping("/member_join")
    public String doMember_join(){
        return "/springbootrecode/login/member_join";
    }
}
