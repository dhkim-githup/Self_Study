package com.example.coffeedev.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeV1ServiceTest {

    @Autowired
    CoffeV1Service v1Service;

    @Test
    public void doTest(){
        List<Map<String, String>> list = v1Service.doCoffeList();

        System.out.println(list);

    }

}