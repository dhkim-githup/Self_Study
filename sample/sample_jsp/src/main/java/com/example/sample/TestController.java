package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/Test")
    public String doTest(){
        return "test";
    }
}
