package com.iterp.pilot1.controller;

import com.iterp.pilot1.service.HelloSvc;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Log4j2
public class Hello {

    @Autowired
    HelloSvc helloSvc;



    @GetMapping("/test")
    public String doTest(@RequestParam(name = "param") String strParam, Model model){

        List<Map<String,Object>> list = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "30");
        map.put("reg_day", "2022.12.09");
        list.add(map);

        map.clear();
        map.put("name", "홍길순");
        map.put("age", "40");
        map.put("reg_day", "2022.12.09");
        list.add(map);

        System.out.println("strParam"+strParam);

        model.addAttribute("welcome", "Hello Spring boot");
        model.addAttribute("list", list);
        model.addAttribute("param",strParam);

        return "/hello";
    }


    @GetMapping({"/hello"})
    public String doHello(@RequestParam("param") String strParam,Model model){

        List<Map<String,Object>> list = new ArrayList<>();

        list = helloSvc.getCustomer();


        model.addAttribute("welcome", "Hello Spring boot");
        model.addAttribute("list", list);

        System.out.println("strParam : "+strParam);
        model.addAttribute("para",strParam);

        return "/hello";
    }

    @GetMapping("/insert_form")
    public String doInsert(){
        return "/insert_form";
    }

    @PostMapping("/insert_exe")
    public String doInsertExe(@RequestParam(value="name") String strName,
                              @RequestParam(value="age") String strAge
    ){

        log.info("strName -> "+strName);
        log.info("strAge -> "+strAge);

        int intReturn = helloSvc.doInsertCst(strName,strAge);
        log.info("intReturn -> "+intReturn);

        //return "/hello";
        return "redirect:/hello";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam(value="no") String strNo
    ){

        log.info("strNo -> "+strNo);


        int intReturn = helloSvc.doDelete(strNo);
        log.info("intReturn -> "+intReturn);

        //return "/hello";
        return "redirect:/hello";
    }
}
