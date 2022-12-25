package com.example.boot2.service;

import com.example.boot2.entity.Log;
import com.example.boot2.repository.LogRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Log4j2
@Service
public class TransactionStudyService {

    @Autowired
    LogRepository logRepository;

    @Autowired
    TransactionTemplate transactionTemplate;

    @Autowired
    PlatformTransactionManager transactionManager;

    @Autowired
    TransactionDefinition definition;

    /* 입력 */
    public void doInsert(Log log ){
        logRepository.save(log);
    }

    /* 삭제 */
    public void doDelete(){ logRepository.deleteAll(); }



    /* =========================================================================================
    * 1. 기본처리
    * */
    public void doDefault(){
        log.info("==================== doDefault ==========================");
        // 삭제
        doDelete();

        // 입력
        Log log = new Log("입력1 - doDefault ");
        doInsert(log);

        // 입력2
        Log log2 = new Log("입력2 - doDefault");
        doInsert(log2);

        // 입력3
        Log log3 = new Log("입력3 - doDefault");
        doInsert(log3);

    }

    /* =========================================================================================
     * 2. @Transactional 처리
     * */
    @Transactional
    public void doTransactional(){
        log.info("==================== @Transactional ==========================");
        // 삭제
        doDelete();

        // 입력
        Log log = new Log("입력1 - @Transactional");
        doInsert(log);

        // 입력2
        Log log2 = new Log("입력2 - @Transactional");
        doInsert(log2);

        // 입력3
        Log log3 = new Log("입력3 - @Transactional");
        doInsert(log3);

    }

    /* =========================================================================================
     * 3. TransactionTemplate 처리
     * */
    public void doTransactionTemplate(){
        log.info("==================== TransactionTemplate ==========================");

        // Transactions With Results
        log.info("================ 삭제 ==================");
        String strReturn = transactionTemplate.execute(status -> {
            doDelete();
            return "OK";
        });



        // Transactions Without Results
        log.info("================ 입력 ==================");
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {

                Log log = new Log("입력1 - TransactionTemplate");
                doInsert(log);

                Log log2 = new Log("입력2 - TransactionTemplate");
                doInsert(log2);

                Log log3 = new Log("입력3 - TransactionTemplate");
                doInsert(log3);

            }
        });


    }

    /* =========================================================================================
     *  4. PlatformTransactionManager 처리
     * */
    public void doPlatformTransactionManager(){
        log.info("==================== PlatformTransactionManager ==========================");

        log.info("================ 삭제 ==================");
        TransactionStatus status = transactionManager.getTransaction(definition);
            // 삭제
            doDelete();
        transactionManager.commit(status);

        log.info("================ 입력 ==================");
        TransactionStatus status2 = transactionManager.getTransaction(definition);
            // 입력
            Log log = new Log("입력1 - PlatformTransactionManager");
            doInsert(log);

            // 입력2
            Log log2 = new Log("입력2 - PlatformTransactionManager");
            doInsert(log2);

            // 입력3
            Log log3 = new Log("입력3 - PlatformTransactionManager");
            doInsert(log3);
        transactionManager.commit(status2);
    }


}
