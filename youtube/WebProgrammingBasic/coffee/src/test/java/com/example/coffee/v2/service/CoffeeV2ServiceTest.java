package com.example.coffee.v2.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeV2ServiceTest {

    @Autowired
    CoffeeV2Service v2Service;

    @Autowired
    CoffeeV2Service_PlatformTransactionManager coffeeV2Service_platformTransactionManager;

    @Autowired
    CoffeeV2Service_TransactionTemplate coffeeV2Service_transactionTemplate;

    @Test
    void doUpdatePriceService() {

        String strPrice = "4567";
        List<String> chkList = new ArrayList<>();
        chkList.add("40");

         try {
             coffeeV2Service_transactionTemplate.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("에러발생 ="+e);
        }

       /* try {
            coffeeV2Service_platformTransactionManager.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("에러발생 ="+e);
        }*/

      /*  try {
            v2Service.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("에러발생 ="+e);
        }*/

    }
}