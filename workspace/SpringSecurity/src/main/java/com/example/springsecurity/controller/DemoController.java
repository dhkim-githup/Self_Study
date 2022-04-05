package com.example.springsecurity.controller;

import com.example.springsecurity.dto.ResponseCookieDTO;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "hello world!!";
    }

    @GetMapping("/session")
    public ResponseCookieDTO hello(@AuthenticationPrincipal User user, HttpSession httpSession) {
        String username = "empty";
        String session_id = "empty";

        if (user == null){
            System.out.println("user is null");
        } else {
            session_id = httpSession.getId();
            username = user.getUsername();
        }

        return new ResponseCookieDTO(username, session_id);
    }

    @GetMapping("/user")
    public ResponseCookieDTO doUser(@AuthenticationPrincipal User user, HttpSession httpSession) {
        String username = "empty";
        String session_id = "empty";

        if (user == null){
            System.out.println("user is null");
        } else {
            session_id = httpSession.getId();
            username = user.getUsername();
        }

        return new ResponseCookieDTO(username, session_id);
    }

}
