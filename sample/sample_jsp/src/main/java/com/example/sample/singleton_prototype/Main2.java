package com.example.sample.singleton_prototype;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Singleton_prototype")
public class Main2 {

    @Autowired
    ServiceBeanScope serviceBeanScope;

    @RequestMapping("/main2")
    public String doTest(HttpServletRequest request) {

        //ServiceTest serviceTest = new ServiceTest();
        System.out.println("");
        System.out.println("Main2");
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