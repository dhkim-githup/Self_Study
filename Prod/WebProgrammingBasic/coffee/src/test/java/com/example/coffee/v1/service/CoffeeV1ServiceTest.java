package com.example.coffee.v1.service;

import com.example.coffee.oracledb.CoffeeV2ServiceOracle;
import com.example.coffee.seconddb.CoffeeV2ServiceSecond;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeV1ServiceTest {

    @Autowired
    CoffeeV1Service v1Service;

    @Autowired
    CoffeeV2ServiceSecond v2ServiceSecond;
    @Autowired
    CoffeeV2ServiceOracle v2ServiceOracle;


    @Test
    void doCoffeeList() {

        // FirstDb
        String strStart_date="2022-03-09";
        String strEnd_date="2022-09-25";
        String strName=null;
        String strKind="ALL";

        List<Map<String, String>> list =  v1Service.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
         System.out.println(list);

        // Second - bootEx
        v2ServiceSecond.doInsertCommonLog();

        // Oracle -
        v2ServiceOracle.doInsertCommonLog();

    }
}