package com.example.coffeedev.v2.service;

import com.example.coffeedev.v2.dao.CoffeeV2Dao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeV2ServiceTest {

    @Autowired
    CoffeeV2Dao v2Dao;

    @Autowired
    CoffeeV2Service v2Service;

    @Test
    @Transactional
    @Commit
    public void doTransactionTest(){

        int intI=0;
        String strPrice="3300";
        List<String> chkList = new ArrayList<>();
        chkList.add("40");

        // Select 처리
        List<Map<String, String>> list = v2Dao.doCoffeeList();


        // Insert 처리
        intI = v2Service.doInsertLog(strPrice, chkList);

        // Update 처리
        intI = v2Service.doUpdatePrice(strPrice, chkList);


//        // 에러발생
//        String er = null;
//        er.equals("error");

        // Common log
        intI = v2Service.doInsertCommonLog("CoffeeV2Service.doUpdatePriceService");

        throw new RuntimeException();
    }

}