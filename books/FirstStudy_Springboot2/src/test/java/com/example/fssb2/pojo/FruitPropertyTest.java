package com.example.fssb2.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class FruitPropertyTest {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test(){
        List<Map> fruitData = fruitProperty.getList();

        System.out.println(fruitData.get(0).get("name"));
        System.out.println(fruitData.get(0).get("color"));

        assertEquals("banana", fruitData.get(0).get("name"));

        System.out.println(fruitData.get(1).get("name"));
        System.out.println(fruitData.get(1).get("color"));

        System.out.println(fruitData.get(2).get("name"));
        System.out.println(fruitData.get(2).get("color"));
    }
}