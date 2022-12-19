package com.iterp.pilot1.v2.controller;

import com.iterp.pilot1.v2.service.HelloSvcV2;
import com.iterp.pilot1.v2.vo.Customer;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Log4j2
@RequestMapping("/v2")
public class HelloV2 {

    @Autowired
    HelloSvcV2 helloSvc;

    @GetMapping("/test")
    public String doTest(Model model){

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


        model.addAttribute("welcome", "Hello Spring boot");
        model.addAttribute("list", list);

        return "/hello";
    }


    @GetMapping({"/hello"})
    public String doHello(Model model){

        List<Customer> list = new ArrayList<>();

        list = helloSvc.getCustomer();


        model.addAttribute("welcome", "Hello Spring boot");
        model.addAttribute("list", list);

        return "/v2/hello";
    }

    @GetMapping("/insert_form")
    public String doInsert(){
        return "/v2/insert_form";
    }

    @PostMapping("/insert_exe")
    public String doInsertExe(Customer customer){

        log.info("customer -> "+customer);


        int intReturn = helloSvc.doInsertCst(customer);
        log.info("intReturn -> "+intReturn);

        //return "/hello";
        return "redirect:/v2/hello";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam(value="no") String strNo
    ){

        log.info("strNo -> "+strNo);


        int intReturn = helloSvc.doDelete(strNo);
        log.info("intReturn -> "+intReturn);

        //return "/hello";
        return "redirect:/v2/hello";
    }
}
