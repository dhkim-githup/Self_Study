package com.example.bootv2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);

        //registry.addViewController("/home/home").setViewName("/home/home");
        registry.addViewController("/login/join").setViewName("/login/join");
        registry.addViewController("/login/login").setViewName("/login/login");
        registry.addViewController("/member/member_list").setViewName("/member/member_list");
        registry.addViewController("/study/list").setViewName("/study/study_list");
    }
}
