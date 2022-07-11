package com.example.aws.web;

import com.example.aws.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;

//@WebMvcTest // 모든 WebMvc 를 테스트해줘요.
@WebMvcTest(HelloController.class) // 나만 테스트해줘요. @Controller 부분만 사용
class HelloControllerTestVer4 {

    @Autowired
    private MockMvc mockMvc; // WebApi 테스트 , Spring MVC 테스트, http get,post 등 사용 가능

    @Test
    void hello_return() throws Exception {
        // expect 값 선언
        String expectHello = "hello";

        mockMvc
                .perform(get("/hello")) //Get 요청 실행
                .andExpect(status().isOk()) // perform 결과를 검증 , 200, 400, 500 등. 200 이면 성공
                .andDo(print()) // 요청 실행된 정보 출력
                .andExpect(content().string(expectHello)); // 본문 내용의 값 검증

    }

    @Test
    public void helloDto_return() throws Exception {

        String name="홍길동";
        int amount =1000;

        /*
        HelloController controller = new HelloController();
        HelloResponseDto helloResponseDto = controller.helloDto(name, amount);
        System.out.println("helloDto_return =>" + helloResponseDto.getName());
        */


        mockMvc
                .perform(get("/hello/dto")
                         .param("name",name)
                         .param("amount", String.valueOf(amount))) //Get 요청 실행
                .andExpect(status().isOk()) // perform 결과를 검증 , 200, 400, 500 등. 200 이면 성공
                .andDo(print()) // 요청 실행된 정보 출력
                .andExpect(jsonPath("$.name",   is(name)))
                .andExpect(jsonPath("$.amount", is(amount)))
                ;

    }

}