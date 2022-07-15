package com.example.aws.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // 열려있는 Port 어떤거든 사용
class IndexControllerTestVer1 {

    @Autowired
    private TestRestTemplate restTemplate; // Web Test 가능

    @Test
    public void mainTest(){
        // When
        String body = this.restTemplate.getForObject("/", String.class);
        System.out.println(body);

        // When
        String body2 = this.restTemplate.getForObject("/test", String.class);
        System.out.println(body2);


    }
}