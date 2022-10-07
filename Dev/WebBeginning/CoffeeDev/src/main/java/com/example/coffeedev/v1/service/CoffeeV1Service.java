package com.example.coffeedev.v1.service;

import com.example.coffeedev.v1.dao.CoffeeV1Dao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Service
 */
@Service
@Log4j2
public class CoffeeV1Service {

    @Autowired
    CoffeeV1Dao v1Dao;


    /* 전체 리스트 조회  */
    public List<Map<String, String>> doCoffeeList(){
        List<Map<String, String>> list = v1Dao.doCoffeeList();
        return list;
    }

    /* 전체 리스트 조회 - Overload */
    public List<Map<String, String>> doCoffeeList(String strStart_date, String strEnd_date, String strName, String strKind) {
        log.info(strStart_date);
        List<Map<String, String>> list = v1Dao.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
        return list;

    }

    public int doInsert(String strName, String strKind, String strPrice) {
        int intI = v1Dao.doInsert(strName, strKind, strPrice);
        return intI;
    }

    public int doDelete(String strCoffee_id) {
        int intI = v1Dao.doDelete(strCoffee_id);

        return intI;
    }

    /* 1 row 가져오기 */
    public Map<String, String> doListOne(String strCoffee_id) {
        Map<String, String> map = v1Dao.doListOne(strCoffee_id);
        return map;
    }

    /* 수정하기 Post */
    public int doUpdate(String strCoffee_id, String strName, String strKind, String strPrice) {
        int intI = v1Dao.doUpdate(strCoffee_id, strName, strKind, strPrice);
        return  intI;
    }

}
