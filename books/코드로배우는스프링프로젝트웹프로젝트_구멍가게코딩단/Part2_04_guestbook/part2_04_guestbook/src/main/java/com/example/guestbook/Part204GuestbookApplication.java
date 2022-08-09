package com.example.guestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Part204GuestbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(Part204GuestbookApplication.class, args);
    }

}
