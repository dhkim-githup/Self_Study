package com.example.coffee.v2.controller;

import com.example.coffee.v2.service.CoffeeV2Service;
import com.example.coffee.v2.service.CoffeeV2Service_PlatformTransactionManager;
import com.example.coffee.v2.vo.VoCoffeeV2;
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
@RequestMapping("/v2")
@Log4j2
public class CoffeeV2 {

    @Autowired
    CoffeeV2Service_PlatformTransactionManager v2Service;
    //CoffeeV2Service v2Service;

    @GetMapping("/coffee")
    public String doCoffee(Model model){

        /* 전체리스트 조회 */
       //List<Map<String, String>> list = v2Service.doCoffeeList();
       //model.addAttribute("list", list);
       // System.out.println(list);

        return "/v2/coffee";
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
        List<VoCoffeeV2> list = v2Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);

        model.addAttribute("list", list);
        // System.out.println(list);

        return "/v2/coffee";
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
        List<VoCoffeeV2> list = v2Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
        log.info(list);

        JSONArray jsonArray = new JSONArray();
        for(VoCoffeeV2 fMap : list){
            JSONObject jsonObject = new JSONObject(fMap);
            //log.info(jsonObject);
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
        return "/v2/coffee_Ins";
    }

    /* 등록하기 Post , HttpServletRequest 사용 */
    @PostMapping("/insert")
    public String doInsertPost(@ModelAttribute VoCoffeeV2 voCoffeeV2
                               ){
        log.info("voCoffeeV2 :"+voCoffeeV2);
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
    public String doUpdatePost(VoCoffeeV2 voCoffeeV2 ){

        log.info("voCoffeeV2"+voCoffeeV2);
        int intI  = v2Service.doUpdate(voCoffeeV2);

        return "redirect:/v2/coffee";
    }

    /* 삭제하기 1 row , @RequestParam 사용  */
    @GetMapping("/delete")
    public String doDelete(@RequestParam(value="coffee_id") String strCoffee_id){

        int intI = v2Service.doDelete(strCoffee_id);

        return "redirect:/v2/coffee";
    }

    /* 가격을 한번에 수정 */
    @PostMapping("/updatePrice")
    public String doUpdatePrice(@RequestParam(value = "hidden_price") String strPrice,
                                @RequestParam(value = "chkCoffee_id", required = false) List<String> chkList,
                                Model model){
        log.info("strPrice:"+strPrice);
        log.info("chkList:"+chkList);

        String strReturn = "redirect:/v2/coffee";

        try {
            int int1 = v2Service.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            model.addAttribute("em", e.getMessage());
            strReturn = "/comm/error";
        }
        /*
        //if(chkList != null) {
           // int int1 = v2Service.doInsertLog(strPrice, chkList);
           // int int2 = v2Service.doUpdatePrice(strPrice, chkList);
        //}
        */
        /*
        for(String coffee_id : chkList){
            int int1 = v2Service.doInsertLogOld(strPrice, coffee_id);
            int int2 = v2Service.doUpdatePriceOld(strPrice, coffee_id);
        }
        */

        //return "redirect:/v2/coffee";
        return strReturn;
    }

}
