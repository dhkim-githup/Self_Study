package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
public class Con_comm {

    @GetMapping("/sessionInfo")
    public void doSession(HttpServletRequest req){

        HttpSession session = req.getSession();

        // 세션 ID 가져오기
        String strSessionId = session.getId();
        System.out.println("session ID : " + strSessionId);

        // 세션의 값을 배열에 넣는다.
        Enumeration<String> names = session.getAttributeNames();

        // Enumeration 추출
        String strSession="";
        while(names.hasMoreElements()){
            strSession = names.nextElement();
            System.out.println(strSession +" : "+ session.getAttribute(strSession));
        }

    }

}
