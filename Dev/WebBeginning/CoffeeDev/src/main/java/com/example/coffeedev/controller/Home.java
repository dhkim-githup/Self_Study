package com.example.coffeedev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Home {

    /**
     * 페이지 첫 화면으로 이동
     * @return
     */
    @GetMapping({"/","/home"}) // 2개의 경로를 동시에 매핑
    public String doHome(){
        return "/home/home";
    }

}
