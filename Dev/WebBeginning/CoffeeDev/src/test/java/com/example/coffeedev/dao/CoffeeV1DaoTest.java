package com.example.coffeedev.dao;

import com.example.coffeedev.v1.dao.CoffeeV1Dao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

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