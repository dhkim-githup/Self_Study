package com.example.aws.web;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    HelloController helloController = new HelloController();

    @Test
    void hello() {

        String expected  = "hello";

        String actual  = helloController.hello();

        System.out.println("Print : "+actual );

        assertEquals(expected , actual );

    }
}