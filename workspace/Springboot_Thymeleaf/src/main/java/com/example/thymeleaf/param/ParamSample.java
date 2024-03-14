package com.example.thymeleaf.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class ParamSample {

    @GetMapping("/param")
    public String doParam(
            Model model){
        return "param/param";
    }
}
