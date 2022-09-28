package com.example.coffee.controller;

import com.example.coffee.service.CoffeeV1Service;
import lombok.extern.log4j.Log4j2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/v1")
@Log4j2
public class CoffeeV1 {

    @Autowired
    CoffeeV1Service v1Service;

    @GetMapping("/coffee")
    public String doCoffee(Model model){

        /* 전체리스트 조회 */
       //List<Map<String, String>> list = v1Service.doCoffeeList();
       //model.addAttribute("list", list);
       // System.out.println(list);

        return "/v1/coffee";
    }

    /* Ajax Get */
    @GetMapping("/coffeeAjax")
    @ResponseBody
    public String doCoffeeAjax(Model model){

        String strArr ="{\"coffee_list\":[";
        strArr +="{\"coffee_id\":\"150\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"},";
        strArr +="{\"coffee_id\":\"160\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"},";
        strArr +="{\"coffee_id\":\"270\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"},";
        strArr  +="{\"coffee_id\":\"180\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"}";
        strArr +="]}";

        return strArr;
    }

    @PostMapping("/coffee")
    public String doCoffeePost(HttpServletRequest request, Model model){

        String strStart_date = request.getParameter("start_date");
        String strEnd_date   = request.getParameter("end_date");
        String strName       = request.getParameter("name");
        String strKind       = request.getParameter("kind");
        log.info(strKind);

        /* 전체리스트 조회 - 오버로딩 */
        List<Map<String, String>> list = v1Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);

        model.addAttribute("list", list);
        // System.out.println(list);

        return "/v1/coffee";
    }

    /* Ajax Post */
    @PostMapping("/coffeeAjaxPost")
    @ResponseBody
    public String doCoffeePostAjax(HttpServletRequest request){

        log.info("=== doCoffeePostAjax === ");
        String strStart_date = request.getParameter("start_date");
        String strEnd_date   = request.getParameter("end_date");
        String strName       = request.getParameter("name");
        String strKind       = request.getParameter("kind");
        log.info(strKind);

        /* 전체리스트 조회 - 오버로딩 */
        List<Map<String, String>> list = v1Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
        log.info(list);

        JSONArray jsonArray = new JSONArray();
        for(Map<String, String> fMap : list){
            JSONObject jsonObject = new JSONObject(fMap);
            log.info(jsonObject);
            jsonArray.put(jsonObject);
        }

        String strArr = "{\"coffee_list\":";
            strArr += String.valueOf(jsonArray);
            strArr += "}";

        log.info("strArr : "+strArr);
        return strArr;
    }

    /* 등록하기 Get */
    @GetMapping("/insert")
    public String doInsert(){
        return "/v1/coffee_Ins";
    }

    /* 등록하기 Post , HttpServletRequest 사용 */
    @PostMapping("/insert")
    public String doInsertPost(@RequestParam(value="name") String name,
                               @RequestParam(value="kind") String kind,
                               @RequestParam(value="price") String price,
                               Model model){
        log.info(name + kind + price);
        int intI = v1Service.doInsert(name, kind, price);

        return "redirect:/v1/coffee";
    }

    /* 수정하기 Get , @RequestParam 사용 */
    @GetMapping("/update")
    public String doUpdate(@RequestParam(value="coffee_id") String strCoffee_id, Model model){

        Map<String,String>  map = v1Service.doListOne(strCoffee_id);
        model.addAttribute("map", map);

        return "/v1/coffee_Up";
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
