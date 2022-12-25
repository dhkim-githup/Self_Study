package com.example.boot2.service;

import com.example.boot2.entity.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class TransactionStudyTest {

    @Autowired
    TransactionStudyService transactionStudy;


    @Test
    public void doTest(){

        // 1. 기본처리
        transactionStudy.doDefault();

        // 2. @Transactional 처리
        //transactionStudy.doTransactional();

        // 3. TransactionTemplate 처리
        //transactionStudy.doTransactionTemplate();

        // 4. PlatformTransactionManager 처리
        //transactionStudy.doPlatformTransactionManager();

    }



}