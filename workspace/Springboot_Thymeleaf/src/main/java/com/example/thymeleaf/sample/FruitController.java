package com.example.thymeleaf.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

// 출처: https://oingdaddy.tistory.com/111 [SI Supply Depot:티스토리]

@Controller
public class FruitController {

        @GetMapping("/fruit")
        public String getFruit(Model model) {
            Map<String, String> fruitmap = new HashMap<String, String>();
                fruitmap.put("fruit1", "apple");
                fruitmap.put("fruit2", "banana");
                fruitmap.put("fruit3", "orange");
            model.addAttribute("fruit", fruitmap);
            return "sample/fruit";
        }
}