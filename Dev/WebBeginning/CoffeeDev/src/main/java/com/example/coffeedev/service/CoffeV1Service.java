package com.example.coffeedev.service;

import com.example.coffeedev.dao.CoffeV1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Service
 */
@Service
public class CoffeV1Service {

    @Autowired
    CoffeV1Dao v1Dao;

    /* 전체 리스트 조회  */
    public List<Map<String, String>> doCoffeList(){
        List<Map<String, String>> list = v1Dao.doCoffeList();
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
