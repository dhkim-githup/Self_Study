package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home {

    @GetMapping("")
    public String doHome(){
        return "/home/home";
    }

    @GetMapping("/study_reg")
    public String doStudy_reg(){
        return "/home/study_reg";
    }

    @GetMapping("/member_list")
    public String doMember_list(){
        return "/home/member_list";
    }
}
