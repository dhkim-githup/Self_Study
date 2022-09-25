package com.example.coffeedev.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeV1DaoTest {

    @Autowired
    CoffeeV1Dao v1Dao;

    @Test
    void doCoffeeList() {
        List<Map<String, String>> list = v1Dao.doCoffeeList("2022-03-09","2022-09-25",null, "ALL");
        System.out.println(list);
    }
}