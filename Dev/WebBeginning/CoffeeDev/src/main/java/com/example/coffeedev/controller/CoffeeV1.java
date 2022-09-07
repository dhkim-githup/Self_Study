package com.example.coffeedev.controller;

import com.example.coffeedev.service.CoffeV1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Controller
 */
@Controller
@RequestMapping("/v1")
public class CoffeeV1 {

    @Autowired
    CoffeV1Service v1Service;

    /* 메뉴 눌렀을때 Get 방식 처리 */
    @GetMapping("/coffee")
    public String doCoffeeGet(Model model){

        List<Map<String, String>> list = v1Service.doCoffeList();
        model.addAttribute("list",list);

        return "/coffee/coffeeV1";
    }

    /* 조회하기 눌렀을때 Post 방식처리 */
    @PostMapping("/coffee")
    public String doCoffePost(){
        return "redirect:/v1/coffee";
    }


    /* 등록하기 Get */
    @GetMapping("/insert")
    public String doInsert(){
        return "/coffee/coffeeV1_Ins";
    }

    /* 등록하기 Post , HttpServletRequest 사용 */
    @PostMapping("/insert")
    public String doInsertPost(HttpServletRequest request, Model model){

        String strName   = request.getParameter("name");
        String strKind   = request.getParameter("kind");
        String strPrice  = request.getParameter("price");

        int intI = v1Service.doInsert(strName, strKind, strPrice);

        return "redirect:/v1/coffee";
    }

    /* 수정하기 Get , @RequestParam 사용 */
    @GetMapping("/update")
    public String doUpdate(@RequestParam(value="coffee_id") String strCoffee_id, Model model){

        Map<String,String>  map = v1Service.doListOne(strCoffee_id);
        model.addAttribute("map", map);

        return "/coffee/coffeeV1_Up";
    }

    /* 수정하기 Post , @RequestParam 사용 */
    @PostMapping("/update")
    public String doUpdatePost(
                               @RequestParam(value="coffee_id") String strCoffee_id,
                               @RequestParam(value="name") String strName,
                               @RequestParam(value="kind") String strKind,
                               @RequestParam(value="price") String strPrice
    ){

        int intI  = v1Service.doUpdate(strCoffee_id, strName, strKind, strPrice);

        return "redirect:/v1/coffee";
    }

    /* 삭제하기 1 row , @RequestParam 사용  */
    @GetMapping("/delete")
    public String doDelete(@RequestParam(value="coffee_id") String strCoffee_id){

        int intI = v1Service.doDelete(strCoffee_id);

        return "redirect:/v1/coffee";
    }


}
