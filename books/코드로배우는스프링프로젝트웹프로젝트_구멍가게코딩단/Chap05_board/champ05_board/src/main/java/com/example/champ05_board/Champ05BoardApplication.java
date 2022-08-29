package com.example.champ05_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Champ05BoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(Champ05BoardApplication.class, args);
    }

}
