package com.example.cst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class Threeways {

    @GetMapping("/")
    public String doRoot(){
        return "list";
    }

    @PostMapping("/Cookie")
    public String setCookie(HttpServletRequest req, HttpServletResponse rep) throws UnsupportedEncodingException {

        req.setCharacterEncoding("UTF-8");

        /* getParameter */
        String strName = req.getParameter("c_name");
        String strAge  = req.getParameter("c_age");
        System.out.println("c_name:"+strName+ "| c_age:"+strAge);

        /* setCookie */
        Cookie cookie_strName =  new Cookie("c_name",strName);
        Cookie cookie_strAge =  new Cookie("c_age",strAge);
        Cookie cookie_strTomcat =  new Cookie("c_server","Tomcat");

        /* response add */
        rep.addCookie(cookie_strName);
        rep.addCookie(cookie_strAge);
        rep.addCookie(cookie_strTomcat);

        return "redirect:/";

    }

    @PostMapping("/Session")
    public String setSession(HttpServletRequest req, HttpServletResponse rep) throws UnsupportedEncodingException {

        req.setCharacterEncoding("UTF-8");

        /* getParameter */
        String strName = req.getParameter("s_name");
        String strAge  = req.getParameter("s_age");
        System.out.println("s_name:"+strName+ "| s_age:"+strAge);

        /* setSession
            1. getSession(), getSession(true)
               - HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 세션을 생성합니다
            2. getSession(false)
               - HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 생성하지 않고 그냥 null을 반환합니다
        */
        HttpSession session = req.getSession();

        session.setAttribute("s_name", strName);
        session.setAttribute("s_age", strAge);

        return "redirect:/";
    }

    @GetMapping("/SessionLogout")
    public String setSessionLogout(HttpServletRequest req, HttpServletResponse rep) throws UnsupportedEncodingException {

        HttpSession session = req.getSession(false);
        session.invalidate();

        return "redirect:/";
    }
}
