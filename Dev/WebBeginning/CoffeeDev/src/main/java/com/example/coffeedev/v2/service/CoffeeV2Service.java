package com.example.coffeedev.v2.service;

import com.example.coffeedev.v2.dao.CoffeeV2Dao;
import com.example.coffeedev.v2.vo.VoCoffeeV2;
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
public class CoffeeV2Service {

    @Autowired
    CoffeeV2Dao v2Dao;


    /* 전체 리스트 조회  */
    public List<Map<String, String>> doCoffeeList(){
        List<Map<String, String>> list = v2Dao.doCoffeeList();
        return list;
    }

    /* 전체 리스트 조회 - Overload */
    public List<VoCoffeeV2> doCoffeeList(String strStart_date, String strEnd_date, String strName, String strKind) {
        log.info(strStart_date);
        List<VoCoffeeV2> list = v2Dao.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
        return list;

    }

    public int doInsert(VoCoffeeV2 voCoffeeV2) {
        int intI = v2Dao.doInsert(voCoffeeV2);
        return intI;
    }

    public int doDelete(String strCoffee_id) {
        int intI = v2Dao.doDelete(strCoffee_id);

        return intI;
    }

    /* 1 row 가져오기 */
    public Map<String, String> doListOne(String strCoffee_id) {
        Map<String, String> map = v2Dao.doListOne(strCoffee_id);
        return map;
    }

    /* 수정하기 Post */
    public int doUpdate(VoCoffeeV2 voCoffeeV2) {
        int intI = v2Dao.doUpdate(voCoffeeV2);
        return  intI;
    }

}
