package com.iterp.pilot1.controller;

import com.iterp.pilot1.service.HelloSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Hello {

    @Autowired
    HelloSvc helloSvc;

    @GetMapping("/test")
    public String doTest(Model model){

        List<Map<String,Object>> list = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "30");
        map.put("reg_day", "2022.12.09");
        list.add(map);

        map.clear();
        map.put("name", "홍길순");
        map.put("age", "40");
        map.put("reg_day", "2022.12.09");
        list.add(map);


        model.addAttribute("welcome", "Hello Spring boot");
        model.addAttribute("list", list);

        return "/hello";
    }


    @GetMapping("/hello")
    public String doHello(Model model){

        List<Map<String,Object>> list = new ArrayList<>();

        list = helloSvc.getCustomer();


        model.addAttribute("welcome", "Hello Spring boot");
        model.addAttribute("list", list);

        return "/hello";
    }

}
