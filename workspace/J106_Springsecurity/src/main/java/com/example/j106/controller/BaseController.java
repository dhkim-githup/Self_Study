package com.example.j106.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /*
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/main")
    public String main(Authentication authentication, ModelMap map) {

        SecurityUser securityUser = (SecurityUser) authentication.getPrincipal();
        map.addAttribute("user", securityUser);

        return "main";
    }

    @RequestMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }

    @RequestMapping("/member")
    public String member() {
        return "member";
    }

    @RequestMapping("/manager")
    public String manager() {
        return "manager";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
    */
}
