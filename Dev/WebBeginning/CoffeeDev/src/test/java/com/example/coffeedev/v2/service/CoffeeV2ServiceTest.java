package com.example.coffeedev.v2.service;

import com.example.coffeedev.v2.dao.CoffeeV2Dao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;

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

    @Autowired
    CoffeeV2Service_PlatformTransactionManager coffeeV2Service_platformTransactionManager;

    @Autowired
    CoffeeV2Service_TransactionTemplate transactionTemplate;

    @Test
    //@Transactional // Test 에서 Transactional 은 기본적으로 rollback 처리를 한다.
    public void doTransactionServiceTest(){
        int intI=0;
        String strPrice="7777";
        List<String> chkList = new ArrayList<>();
        chkList.add("30");
        chkList.add("40");

         try {
            intI = transactionTemplate.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("처리중 오류 발생 ---"+e.getMessage());
        }

       /* try {
            intI = coffeeV2Service_platformTransactionManager.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("처리중 오류 발생 ---"+e.getMessage());
        }*/
        // 서비스에서 DB 처리
       /* try {
            intI = coffeeV2Service_platformTransactionManager.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("처리중 오류 발생 ---"+e.getMessage());
        }*/

/*        try {
            intI = v2Service.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("처리중 오류 발생 ---"+e.getMessage());
        }*/

    }

    @Test
    //@Transactional // Test 에서 Transactional 은 기본적으로 rollback 처리를 한다.
    //@Rollback
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
        //intI = v2Service.doInsertCommonLog("CoffeeV2Service.doUpdatePriceService");

       // throw new Exception();
    }

}