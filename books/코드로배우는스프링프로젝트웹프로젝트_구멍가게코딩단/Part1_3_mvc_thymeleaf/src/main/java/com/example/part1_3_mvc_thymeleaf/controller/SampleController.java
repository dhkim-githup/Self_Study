package com.example.part1_3_mvc_thymeleaf.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @GetMapping("/ex1")
    public String doEx1(){
        //log.info("ex1...............");
        return "/sample/ex1";
    }
}
