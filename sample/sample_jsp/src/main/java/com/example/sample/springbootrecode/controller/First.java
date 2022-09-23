package com.example.sample.springbootrecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class First {

    @GetMapping("/home")
    public String doFirst(){
        return "/springbootrecode/home/home";
    }
}
