package com.example.coffeedev.service;

import com.example.coffeedev.v1.service.CoffeeV1Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class CoffeV1ServiceTest {

    @Autowired
    CoffeeV1Service v1Service;

    @Test
    public void doTest(){
        //List<Map<String, String>> list = v1Service.doCoffeList();

        String strStart_date="2022-03-09";
        String strEnd_date="2022-09-25";
        String strName=null;
        String strKind="ALL";
        List<Map<String, String>> list = v1Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);

        System.out.println(list);

    }

}