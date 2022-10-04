package com.example.sample.aboutRequest.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;

/**
 * request 객체가 파라메터를 받는 방법 설명
 * @author IT늦공
 * @since 2022-09 *
 */

@RestController
@RequestMapping("/aboutRequest/request")
@Log4j2
public class _Controller {


    /**
     * get 방식 파라메터 확인
     * @param request
     * @return No
     */
    @GetMapping("/get")
    public String doGet(HttpServletRequest request) throws IOException {

        /*
        // 파라메터를 배열 객체로 받는다.
        Enumeration e = request.getParameterNames();

        // 파라메타의 갯수만큼 출력한다.
        String strName="";
        while ( e.hasMoreElements() ){
            strName = (String) e.nextElement();
            log.info(strName+":"+ request.getParameter(strName));
        }
        */
        String strTemplate = "request | name : %s , age : %s ";

        String strName = request.getParameter("name");
        String strAge  = request.getParameter("age");

        return String.format(strTemplate, strName, strAge);
    }

    /**
     * post 방식 파라메터 확인
     * @param request
     * @return No
     */
    @PostMapping("/post")
    public String doPost(HttpServletRequest request) throws IOException {
        /*
        // 파라메터를 배열 객체로 받는다.
        Enumeration e = request.getParameterNames();

        // 파라메타의 갯수만큼 출력한다.
        String strName="";
        while ( e.hasMoreElements() ){
            strName = (String) e.nextElement();
            log.info(strName+":"+ request.getParameter(strName));
        }
        */

        String strTemplate = "request | name : %s , age : %s ";

        String strName = request.getParameter("name");
        String strAge  = request.getParameter("age");

        return String.format(strTemplate, strName, strAge);

    }

    /**
     * json 방식 파라메터 확인
     * @param request
     * @return No
     * @link https://docs.oracle.com/javaee/7/api/javax/servlet/ServletInputStream.html
     */
    @PostMapping("/json")
    public String doJson(HttpServletRequest request) throws IOException {

        /* https://docs.oracle.com/javaee/7/api/javax/servlet/ServletInputStream.html */
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        log.info("messageBody:"+messageBody);

        JSONObject jObject = new JSONObject(messageBody);

        log.info("JSONObject:name:"+ jObject.getString("name"));
        log.info("JSONObject:age:"+ jObject.getInt("age"));

        return String.valueOf(jObject);
    }



}
