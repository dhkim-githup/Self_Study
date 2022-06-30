package com.secu.geesun.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Account_Controller {

    @Autowired
    AccountService accountService;

    @GetMapping("/create")
    public Account create(){
        Account account = new Account();

        account.setEmail("test@test.com");
        account.setPassword("password");

        accountService.save(account);

        return  accountService.save(account);
    }
}
