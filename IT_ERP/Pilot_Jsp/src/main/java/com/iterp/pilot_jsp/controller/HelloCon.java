package com.iterp.pilot_jsp.controller;

import com.iterp.pilot_jsp.service.HelloSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloCon {

    @Autowired
    HelloSvc helloSvc;


    @GetMapping("/jsp")
    public String doJsp(){
        return "/hello";
    }

    @GetMapping("/hello")
    public String doHello(Model model){

        List<Map<String,Object>> list = helloSvc.getCustomer();

        model.addAttribute("welcome", "Hello Spring boot JSP - Controller");
        model.addAttribute("list", list);

        return "/hello";

    }

}
