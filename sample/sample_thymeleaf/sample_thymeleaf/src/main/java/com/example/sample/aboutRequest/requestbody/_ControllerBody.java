package com.example.sample.aboutRequest.requestbody;

import com.example.sample.aboutRequest.vo.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * request 객체가 파라메터를 받는 방법 설명
 * @author IT늦공
 * @since 2022-09 *
 */

@RestController
@RequestMapping("/aboutRequest/request_body")
@Log4j2
public class _ControllerBody {


    /**
     * get 방식 파라메터 확인
     * @param
     * @return No
     */
    @GetMapping("/get")
    public String doGet(@RequestBody Person person){

            log.info("Name:"+ person.getName());
            log.info("Age:"+ person.getAge());

        return "get";
    }

    /**
     * post 방식 파라메터 확인
     * @param
     * @return No
     */
    @PostMapping("/post")
    public String doPost(@RequestBody Person person){

        log.info("Name:"+ person.getName());
        log.info("Age:"+ person.getAge());
        return "post";
    }

    /**
     * json 방식 파라메터 확인
     * @param
     * @return No
     * @link https://docs.oracle.com/javaee/7/api/javax/servlet/ServletInputStream.html
     */
    /*
    @PostMapping("/json")
    public String doJson(@RequestBody Person person){

        log.info(person);
        log.info("Name:"+ person.getName());
        log.info("Age:"+ person.getAge());

        return "json";
    }
    */

    @PostMapping("/json")
    public String doJson(@RequestBody Map<String, Object> map){

        log.info(map);

        map.forEach((k, v)
                -> log.info("name:"+k+", Value:"+v)
        );


        //log.info("Name:"+ person.getName());
        //log.info("Age:"+ person.getAge());

        return "json";
    }


}
