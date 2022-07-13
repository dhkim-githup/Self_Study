package com.example.aws.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@WebMvcTest // 모든 WebMvc 를 테스트해줘요.
//@WebMvcTest(HelloController.class) // 나만 테스트해줘요.
@SpringBootTest // 스프링 구동해줘요.
class HelloControllerTestVer2 {

    @Autowired
    HelloController helloController;

    @Test
    void hello_return() {

        // 테스트를 위해 생성자 선언
        //HelloController helloController = new HelloController();
            // expect 값 선언
            String expectHello = "hello";
            // 컨트롤러 값 출력
            System.out.println("System.out =>"+helloController.hello());
            // 값의 비교
            assertEquals(expectHello, helloController.hello());
    }
}