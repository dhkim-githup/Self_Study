package com.example.aws.web.dto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Autowired
    private MockMvc mockMvc; // WebApi 테스트 , Spring MVC 테스트, http get,post 등 사용 가능

    @Test
    public void lombok_test(){

        // 변수 선언
        String name="홍길동";
        int   amount=1000;

        // 객체 생성
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        // Testing
        // assertEquals(expected, actual);
        assertEquals(helloResponseDto.getName(), name);
        assertEquals(helloResponseDto.getAmount(), amount);
    }



}