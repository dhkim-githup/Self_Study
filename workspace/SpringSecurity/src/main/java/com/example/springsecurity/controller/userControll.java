package com.example.springsecurity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userControll {

    @GetMapping("/info")
    public String info(@AuthenticationPrincipal User user){

        return user.getUsername();

    }
}
