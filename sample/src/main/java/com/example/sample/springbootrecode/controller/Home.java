package com.example.sample.springbootrecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springbootrecode/home")
public class Home {

    @GetMapping("")
    public String doHome(){

        return "/springbootrecode/home/home";

    }

    @GetMapping("/study_reg")
    public String doStudy_reg(){
        return "/springbootrecode/home/study_reg";
    }

    @GetMapping("/member_list")
    public String doMember_list(){
        return "/springbootrecode/home/member_list";
    }
}
