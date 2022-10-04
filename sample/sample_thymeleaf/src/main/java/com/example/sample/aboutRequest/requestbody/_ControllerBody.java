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
    public String doGet(@RequestBody String strBody){

        log.info("strBody:"+ strBody);
        return strBody;
    }


    /**
     * post 방식 파라메터 확인
     * @param
     * @return No
     */

    @PostMapping("/post")
    public String doPost(@RequestBody String strBody){
            log.info("strBody:"+ strBody);
        return strBody;
    }

    /**
     * json 방식 파라메터 확인
     * @param person
     * @return No
     * @link https://docs.oracle.com/javaee/7/api/javax/servlet/ServletInputStream.html
     */

    @PostMapping("/json")
    public String doJson(@RequestBody Person person){

        log.info(person);
        log.info("Name:"+ person.getName());
        log.info("Age:"+ person.getAge());

        String strTemplate = "name : %s , age : %s ";
        return String.format(strTemplate, person.getName(), person.getAge());
    }

    /**
     * json 방식 파라메터 확인
     * @param  map
     * @return No
     * @link https://docs.oracle.com/javaee/7/api/javax/servlet/ServletInputStream.html
     */


    @PostMapping("/json2")
    public String doJson2(@RequestBody Map<String, Object> map){

        log.info(map);

        /*
        map.forEach((k, v)
                -> log.info("name:"+k+", Value:"+v)
        );
        */

        String strTemplate = "name : %s , age : %s ";
        return String.format(strTemplate, map.get("name"), map.get("age"));

    }



}
