package com.example.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class CoffeV1 {

    @GetMapping("/coffee")
    public String doCoffee(){
        return "/v1/coffee";
    }

}
