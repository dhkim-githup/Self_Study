package com.example.guide1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "Hello, World";
    }

}