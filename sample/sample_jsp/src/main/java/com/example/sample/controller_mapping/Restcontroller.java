package com.example.sample.controller_mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RequestMapping")
public class Restcontroller {

    /* RestController 변환 */
    @RequestMapping("/RestBase")
    public String doResponse(){
        String strContents = "View : RestController!! <HR>";
        return strContents;
    }
}
