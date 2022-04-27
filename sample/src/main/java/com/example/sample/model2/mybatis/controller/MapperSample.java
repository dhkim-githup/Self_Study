package com.example.sample.model2.mybatis.controller;

import com.example.sample.model2.mybatis.dao.Dao_If_Sample;

import com.example.sample.model2.vo.Vo_study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* Mapper 반환예제 */

@RestController
@RequestMapping("/mybatis")
public class MapperSample {

    @Autowired
    Dao_If_Sample dao_if_sample;

    /* String 반환 예제 */
    @GetMapping("/string")
    public String doString(){

        String strContents = dao_if_sample.doString("1001");
        return strContents;
    }

    /* int 반환 예제 */
    @GetMapping("/int")
    public int doInt(){
        int int_count = dao_if_sample.doInt(1001);
        return int_count;
    }

    /* Collection 반환 예제 */
    @GetMapping("/collection")
    public String doCollection(){
        List<Map<String, String>> list = new ArrayList();
        list = dao_if_sample.doCollection();

        System.out.println("list.size() > " + list.size());

        String strV = "";
        for(Map<String, String> strMap : list){
            for(String key : strMap.keySet()){ System.out.println("키 : " + key); }

            System.out.println(strMap.get("KEY_ID"));
            System.out.println(strMap.get("STUDY_DAY"));
            System.out.println(strMap.get("CONTENTS"));
            System.out.println(strMap.get("REG_DAY"));
            strV = strV + "key_id :"   +strMap.get("KEY_ID");
            strV = strV + "study_day :"+strMap.get("STUDY_DAY");
            strV = strV + "contents :" +strMap.get("CONTENTS" );
            strV = strV + "reg_day :"  +strMap.get("REG_DAY");
            strV = strV + "</br>";
        }

        return strV;
    }

    /* Collection 반환 예제 */
    @GetMapping("/resultmap")
    public String doResultMap(){
        List<Map<String, String>> list = new ArrayList();
        list = dao_if_sample.doResultMap();

        System.out.println("list.size() > " + list.size());

        String strV = "";
        for(Map<String, String> strMap : list){
            for(String key : strMap.keySet()){ System.out.println("키 : " + key); }

            System.out.println(strMap.get("key_id2"));
            System.out.println(strMap.get("study_day2"));
            System.out.println(strMap.get("contents2"));
            System.out.println(strMap.get("reg_day2"));
            strV = strV + "key_id2 :"   +strMap.get("key_id2");
            strV = strV + "study_day2 :"+strMap.get("study_day2");
            strV = strV + "contents2 :" +strMap.get("contents2" );
            strV = strV + "reg_day2 :"  +strMap.get("reg_day2");
            strV = strV + "</br>";
        }

        return strV;
    }

    /* vo 반환 예제 */
    @GetMapping("/vo")
    public String doVo(){
        List<Vo_study> list = new ArrayList<>();

        list = dao_if_sample.doVo();

        System.out.println("doVo | list.size() > " + list.size());

        String strV = "";
        for(Vo_study vo_study : list){


            strV = strV + " key_id_vo : "   +vo_study.getKey_id();
            strV = strV + " study_day_vo : "+vo_study.getStudy_day();
            strV = strV + " contents_vo : " +vo_study.getContents();
            strV = strV + " reg_day_vo : "  +vo_study.getReg_day();
            strV = strV + "</br>";
        }

        return strV;
    }

    /* pl/sql 반환 예제 */
    @GetMapping("/plsql")
    public String doPlsql(){
        return "plsql";
    }

}
