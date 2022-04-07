package com.example.cst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Threeways {

    @RequestMapping(value = "/Cookie", method = RequestMethod.POST)
    public String setCookie(HttpServletRequest req, HttpServletResponse rep){

        /* getParameter */
        String strName = req.getParameter("name");
        String strAge  = req.getParameter("age");
        System.out.println("name:"+strName+ "| age:"+strAge);

        /* setCookie */
        Cookie cookie_strName =  new Cookie("name",strName);
        Cookie cookie_strAge =  new Cookie("age",strAge);

        /* response add */
        rep.addCookie(cookie_strName);
        rep.addCookie(cookie_strAge);

        return "list";

    }

}
