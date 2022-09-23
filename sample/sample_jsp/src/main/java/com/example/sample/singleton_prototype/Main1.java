package com.example.sample.singleton_prototype;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Singleton_prototype")
public class Main1 {

    @Autowired
    ServiceBeanScope serviceBeanScope;


    @RequestMapping("/main1")
    public @ResponseBody String doTest(HttpServletRequest request) {

        //ServiceTest serviceTest = new ServiceTest();
        System.out.println("");
        System.out.println("Main1");
        System.out.println("serviceBeanScope  => "+serviceBeanScope);

        String name = serviceBeanScope.getName();
        System.out.println("name =>"+name);


        String reName = request.getParameter("name");
        serviceBeanScope.setName(reName);

        name = serviceBeanScope.getName();
        System.out.println("param =>"+name);

        return name;
    }
}