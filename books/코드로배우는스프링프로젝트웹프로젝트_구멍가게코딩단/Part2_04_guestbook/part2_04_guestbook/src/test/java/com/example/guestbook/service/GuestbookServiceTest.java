package com.example.guestbook.service;

import com.example.guestbook.dto.GuestbookDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GuestbookServiceTest {

    @Autowired
    GuestbookService guestbookService; // 자동으로 구현체를 하나 가져옮. 구현체가 두개라면 ??

    @Test
    public void testRegister(){

        GuestbookDTO dto = GuestbookDTO.builder()
                .title("Sample Title.")
                .content("Sample Contents.")
                .writer("user0")
                .build();

        System.out.println(guestbookService.register(dto));

    }

}