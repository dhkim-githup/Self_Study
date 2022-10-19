package com.example.coffeedev.v2.controller;

import com.example.coffeedev.v2.service.CoffeeV2Service;
import com.example.coffeedev.v2.vo.VoCoffeeV2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.log4j.Log4j2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Controller
 */
@Controller
@RequestMapping("/v2")
@Log4j2
public class CoffeeV2 {

    @Autowired
    CoffeeV2Service v2Service;

    /* 메뉴 눌렀을때 Get 방식 처리 */
    @GetMapping("/coffee")
    public String doCoffeeGet(Model model){
        /*
        List<Map<String, String>> list = v2Service.doCoffeeList();
        model.addAttribute("list",list);
        log.info("- doCoffeeGet -");
        */
        return "/v2/coffee";

    }

    /* 조회하기 눌렀을때 Post 방식처리 */
    @PostMapping("/coffee")
    public String doCoffeePost(HttpServletRequest request, Model model){
        log.info("-----------doCoffeePost------------");
        String strStart_date = request.getParameter("start_date");
        String strEnd_date   = request.getParameter("end_date");
        String strName       = request.getParameter("name");
        String strKind       = request.getParameter("kind");
        log.info(strKind);

        /* 전체리스트 조회 - 오버로딩 */
        List<VoCoffeeV2> list = v2Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);

        model.addAttribute("list", list);
        // System.out.println(list);

        return "/v2/coffee";
    }

    /* Json Get */
    @GetMapping("/coffeeAjax")
    //@ResponseBody
    public String doCoffeeAjax(){
        /*
        List<Map<String, String>> list = v2Service.doCoffeeList();

        String strList="";
        JSONArray resArr = new JSONArray();

        for(Map<String, String> map : list){
               log.info(map);
            JSONObject resObj = new JSONObject(map);
                log.info(resObj);
            resArr.put(resObj);
                log.info(resArr);
        }

        String strArr = "{\"coffee_list\":";
               strArr += String.valueOf(resArr);
               strArr +="}";
         */
        /*
        String strArr ="{\"coffee_list\":[";
         strArr +="{\"coffee_id\":\"15\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"},";
         strArr +="{\"coffee_id\":\"16\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"},";
         strArr +="{\"coffee_id\":\"27\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"},";
        strArr  +="{\"coffee_id\":\"18\", \"name\":\"메뉴명\", \"kind\":\"종류\", \"price\":\"가격\", \"reg_day\": \"등록일\", \"mod_day\":\"수정일\"}";
        strArr +="]}";
        */
        return "/v2/coffee_ajax";
    }

    /* Json Get */
    @GetMapping("/coffeeAjax2")
    @ResponseBody
    public JSONPObject doCoffeeAjax2() throws JsonProcessingException {

        List<Map<String, String>> list = v2Service.doCoffeeList();

       /* ObjectMapper 사용 */
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(list);
        log.info("ObjectMapper : "+jsonStr);


        JSONPObject json = new JSONPObject("JSON.parse", list);
        jsonStr = mapper.writeValueAsString(json);
        log.info("JSONPObject : "+jsonStr);

        /* JSONArray, JSONObject */
        String strList="";
        JSONArray resArr = new JSONArray();

        /*
        for(Map<String, String> map : list){
            //log.info(map);
            ObjectMapper mapper2 = new ObjectMapper((JsonFactory) map);
            //log.info(mapper2);

            //log.info(resArr);
        }

         */

        log.info("resArr : "+jsonStr);

        return json;
    }


    /* Json Map */
    @GetMapping("/coffeeAjax3")
    @ResponseBody
    //public Map<String, Object> doCoffeeAjax3(){
    public String doCoffeeAjax3(){

        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Hong");
        map.put("Age",50);
        System.out.println(map);

        return String.valueOf(map);
    }

    /* Json List */
    @GetMapping("/coffeeAjax4")
    @ResponseBody
    public List<Map<String,Object>> doCoffeeAjax4(){

        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Hong");
        map.put("Age",50);
        System.out.println(map);

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        System.out.println(list);
        return list;
    }

    /* Json JSONObject vs JSONPObject */
    @GetMapping("/coffeeAjax5")
    @ResponseBody
    public JSONPObject doCoffeeAjax5(){

        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Hong");
        map.put("Age",50);
        System.out.println(map);

        JSONObject resObj = new JSONObject(map);

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        System.out.println(list);

        ObjectMapper mapper = new ObjectMapper();
        JSONPObject json = new JSONPObject("", list);

        return json;
    }

    /* Json */
    @PostMapping("/coffeeAjax")
    @ResponseBody
    public String doCoffeeAjaxPost(@RequestParam(value="start_date") String start_date,
                                   @RequestParam(value="end_date") String end_date,
                                   @RequestParam(value="name") String name,
                                   @RequestParam(value="kind") String kind)
    {
        log.info("-----------doCoffeeAjaxPost------------Line 195");
        log.info("start_date :"+ start_date);
        log.info("end_date :"+ end_date);
        log.info("kind :"+ kind);
        List<VoCoffeeV2> list = v2Service.doCoffeeList(start_date, end_date, name, kind);


        JSONArray resArr = new JSONArray();

        for(VoCoffeeV2 map : list){
            //og.info(map);
            JSONObject resObj = new JSONObject(map);
            //log.info(resObj);
            resArr.put(resObj);
            //log.info(resArr);
        }

        String strArr = "{\"coffee_list\":";
        strArr += String.valueOf(resArr);
        strArr +="}";

        log.info(strArr);

        return strArr;
    }

    @PostMapping("/coffeeAjaxJson")
    @ResponseBody
    public String doCoffeeAjaxJson(@RequestParam(value="start_date") String start_date,
                                   @RequestParam(value="end_date") String end_date,
                                   @RequestParam(value="name") String name,
                                   @RequestParam(value="kind") String kind) throws JsonProcessingException {
        log.info("-----------doCoffeeAjaxJson------------Line 228");
        log.info("start_date :"+ start_date);
        log.info("end_date :"+ end_date);
        log.info("name :"+ name);
        List<VoCoffeeV2> list = v2Service.doCoffeeList(start_date, end_date, name, kind);

        log.info("list :"+list);

        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(list);
        log.info("jsonStr :"+jsonStr);


        /*
        JSONArray resArr = new JSONArray();

        for(VoCoffeeV2 map : list){
            //og.info(map);
            JSONObject resObj = new JSONObject(map);
            //log.info(resObj);
            resArr.put(resObj);
            //log.info(resArr);
        }
        */


        String strArr = "{\"coffee_list\":";
        strArr += String.valueOf(jsonStr);
        strArr +="}";

        //log.info(strArr);

        return strArr;
    }

    /* 등록하기 Get */
    @GetMapping("/insert")
    public String doInsert(){
        return "/v2/coffee_Ins";
    }

    /* 등록하기 Post , HttpServletRequest 사용 */
    @PostMapping("/insert")
    public String doInsertPost(VoCoffeeV2 voCoffeeV2){

//        String strName   = request.getParameter("name");
//        String strKind   = request.getParameter("kind");
//        String strPrice  = request.getParameter("price");
        log.info("voCoffeeV2 : "+voCoffeeV2);
        int intI = v2Service.doInsert(voCoffeeV2);

        return "redirect:/v2/coffee";
    }

    /* 수정하기 Get , @RequestParam 사용 */
    @GetMapping("/update")
    public String doUpdate(@RequestParam(value="coffee_id") String strCoffee_id, Model model){

        Map<String,String>  map = v2Service.doListOne(strCoffee_id);
        model.addAttribute("map", map);

        return "/v2/coffee_Up";
    }

    /* 수정하기 Post , @RequestParam 사용 */
    @PostMapping("/update")
    public String doUpdatePost(@ModelAttribute VoCoffeeV2 voCoffeeV2){
        log.info("voCoffeeV2 ->"+voCoffeeV2);
        int intI  = v2Service.doUpdate(voCoffeeV2);

        return "redirect:/v2/coffee";
    }

    /* 삭제하기 1 row , @RequestParam 사용  */
    @GetMapping("/delete")
    public String doDelete(@RequestParam(value="coffee_id") String strCoffee_id){

        int intI = v2Service.doDelete(strCoffee_id);

        return "redirect:/v2/coffee";
    }

    /**
     * 가격일괄수정
     * @param
     * @return
     */
    @PostMapping("/updatePrice")
    public String doUpdatePrice(@RequestParam(value = "hidden_price") String strPrice,
                                @RequestParam(value = "chkCoffee_id", required = false) List<String> chkList){
        /*
        for(String coffee_id : chkList){
            int int1 = v2Service.doInsertLogOld(strPrice, coffee_id);
            int int2 = v2Service.doUpdatePriceOld(strPrice, coffee_id);
        }
        */
        int intI = v2Service.doUpdatePriceService(strPrice, chkList);

        /*if(chkList != null) {
            // 로그기록
            int intI = v2Service.doInsertLog(strPrice, chkList);

            // 가격 일괄변경
            intI = v2Service.doUpdatePrice(strPrice, chkList);
        }*/
        return "redirect:/v2/coffee";
    }
}
