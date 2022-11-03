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

    @Test
    void doUpdatePriceService() {

        String strPrice = "3330";
        List<String> chkList = new ArrayList<>();
        chkList.add("40");

        try {
            v2Service.doUpdatePriceService(strPrice, chkList);
        }catch (Exception e){
            System.out.println("에러발생 ="+e);
        }

    }
}