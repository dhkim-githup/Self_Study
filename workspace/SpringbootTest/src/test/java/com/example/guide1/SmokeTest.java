package com.example.guide1;

import com.example.guide1.Testing_the_Web_Layer.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController homeController;

    @Test
    public void contextLoads(){
        assertThat(homeController).isNotNull();

        String expect = "Hello, World";

        assertThat(homeController.greeting()).isEqualTo(expect);

    }

}
