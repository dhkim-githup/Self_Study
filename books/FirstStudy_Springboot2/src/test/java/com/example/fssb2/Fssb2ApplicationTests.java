package com.example.fssb2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Fssb2ApplicationTests {

    @Value("${property.test.name}")
    private String propertyTestName;

    @Value("${propertyTest}")
    private String propertyTest;

    @Value("${propertyTestList}")
    private String[] propertyTestList;

    @Value("${bookTitle}")
    private String bookTitle;

    @Test
    void contextLoads() {

        System.out.println("propertyTestName =>"+propertyTestName);
        System.out.println("propertyTestName =>"+propertyTest);
        System.out.println("propertyTestName =>"+propertyTestList[0]);
        System.out.println("propertyTestName =>"+bookTitle);

    }

}
