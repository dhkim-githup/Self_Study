package com.example.sample.threeways;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/*
    Cookie vs Session
 */

@Controller
@RequestMapping("/Threeways")
public class Threeways {

    @GetMapping("/Default")
    public String doDefault(){
        return "threeways/list";
    }

    @PostMapping("/Cookie")
    public String setCookie(HttpServletRequest req, HttpServletResponse rep) throws UnsupportedEncodingException {

        req.setCharacterEncoding("UTF-8");

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

        return "threeways/list";

    }

    @PostMapping("/Session")
    public String setSession(HttpServletRequest req, HttpServletResponse rep) throws UnsupportedEncodingException {

        req.setCharacterEncoding("UTF-8");

        /* getParameter */
        String strName = req.getParameter("name");
        String strAge  = req.getParameter("age");
        System.out.println("name:"+strName+ "| age:"+strAge);

        /* setSession
            1. getSession(), getSession(true)
               - HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 세션을 생성합니다
            2. getSession(false)
               - HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 생성하지 않고 그냥 null을 반환합니다
        */
        HttpSession session = req.getSession();

        session.setAttribute("name", strName);
        session.setAttribute("age", strAge);

        return "threeways/list";
    }

    @GetMapping("/SessionLogout")
    public String setSessionLogout(HttpServletRequest req, HttpServletResponse rep) throws UnsupportedEncodingException {

        HttpSession session = req.getSession(false);
        session.invalidate();

        return "threeways/list";
    }
}
