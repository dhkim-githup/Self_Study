package com.secu.geesun.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
public class Account_Controller {

    @Autowired
    AccountService accountService;

    @GetMapping("/create")
    public Account create(){
        Account account = new Account();

        account.setEmail("test@test.com");
        account.setPassword("password");

        return  accountService.save(account);
    }

    /*
    @PostMapping("/perform_login")
    public void doLogin(){
        System.out.println("Hi login");
    }
    */

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
