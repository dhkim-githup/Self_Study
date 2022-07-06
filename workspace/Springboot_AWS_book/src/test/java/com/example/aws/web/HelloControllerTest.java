package com.example.aws.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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