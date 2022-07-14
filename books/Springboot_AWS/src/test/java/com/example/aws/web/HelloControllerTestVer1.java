package com.example.aws.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTestVer1 {


    @Test
    void hello_return() {

        // 테스트를 위해 생성자 선언
        HelloController helloController = new HelloController();
            // expect 값 선언
            String expectHello = "hello";
            // 컨트롤러 값 출력
            System.out.println(helloController.hello());
            // 값의 비교
            assertEquals(expectHello, helloController.hello());
    }
}