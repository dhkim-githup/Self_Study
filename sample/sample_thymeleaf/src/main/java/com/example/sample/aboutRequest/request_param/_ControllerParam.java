package com.example.sample.aboutRequest.request_param;

import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;

/**
 * request 객체가 파라메터를 받는 방법 설명
 * @author IT늦공
 * @since 2022-10 *
 */

@RestController
@RequestMapping("/aboutRequest/request_param")
@Log4j2
public class _ControllerParam {


    /**
     * get 방식 파라메터 확인
     * @param request
     * @return No
     */
    @GetMapping("/get")
    public String doGet(@RequestParam(value="name") String strName,
                        @RequestParam(value="age", defaultValue = "200") String strAge){

            log.info("Name:"+ strName);
            log.info("Age:"+ strAge);

        String strTemplate = "request_param | name : %s , age : %s ";

        return String.format(strTemplate, strName, strAge);
    }

    /**
     * post 방식 파라메터 확인, map 처리
     * @param map
     * @return No
     */
    @PostMapping("/post")
    public String doPost(@RequestParam Map<String,Object> map){

        log.info(map);
        log.info("Name:"+ map.get("name"));
        log.info("Age:"+ map.get("age"));

        String strTemplate = "request_param | name : %s , age : %s ";

        return String.format(strTemplate, map.get("name"), map.get("age"));
    }

    /**
     * json 방식 파라메터 확인
     * @param map
     * @return No
     * @link https://docs.oracle.com/javaee/7/api/javax/servlet/ServletInputStream.html
     */
    @PostMapping("/json")
    public String doJson(@RequestParam Map<String,Object> map){

        log.info(map);
        log.info("Name:"+ map.get("name"));
        log.info("Age:"+ map.get("age"));

        String strTemplate = "name : %s , age : %s ";
        return String.format(strTemplate, map.get("name"), map.get("age"));
    }



}
