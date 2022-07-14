package com.example.fssb2.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class FruitPropertyTestPojo {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test(){
        List<Fruit> fruitData = fruitProperty.getList();

        System.out.println(fruitData.get(0).getName());
        System.out.println(fruitData.get(0).getColor());

        assertEquals("banana", fruitData.get(0).getName());

        System.out.println(fruitData.get(1).getName());
        System.out.println(fruitData.get(1).getColor());

        System.out.println(fruitData.get(2).getName());
        System.out.println(fruitData.get(2).getColor());
    }
}