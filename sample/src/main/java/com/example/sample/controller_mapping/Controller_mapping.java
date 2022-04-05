package com.example.sample.controller_mapping;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/RequestMapping")
public class Controller_mapping {

    /*
        RequestMapping 의 기본 메서드는 들어오는 값에 따라 Get , Post 를 유연하게 처리함
     */
    @RequestMapping("/Default")
    public String doDefault(HttpServletRequest req){

        String strName = req.getParameter("name");
        String strAge  = req.getParameter("age");

        String strReturn = "strName : "+strName+"</p>"+"strAge : "+strAge;

        return strReturn;
    }

    /*
        GetMapping
    */
    @GetMapping("/Get")
    public String doGet(HttpServletRequest req){

        String strName = req.getParameter("name");
        String strAge  = req.getParameter("age");

        String strReturn = "strName : "+strName+"</p>"+"strAge : "+strAge;

        return strReturn;
    }

    /*
        PostMapping 의 기본 메서드는 들어오는 값에 따라 Get , Post 를 유연하게 처리함
    */
    @PostMapping("/Post")
    public String doPost(HttpServletRequest req){

        String strName = req.getParameter("name");
        String strAge  = req.getParameter("age");

        String strReturn = "strName : "+strName+"</p>"+"strAge : "+strAge;

        return strReturn;
    }
}
