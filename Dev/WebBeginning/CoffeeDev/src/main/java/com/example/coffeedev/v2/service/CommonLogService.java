package com.example.coffeedev.v2.service;

import com.example.coffeedev.v2.dao.CoffeeV2Dao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
public class CommonLogService {

    @Autowired
    PlatformTransactionManager transactionManager;
    @Autowired
    TransactionDefinition definition;

    @Autowired
    CoffeeV2Dao v2Dao;

    /*
        https://ocblog.tistory.com/91
        https://whitepro.tistory.com/581
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW) // REQUIRES_NEW 는 별도 클래스로 분리했을경우 사용 적용이 된다.
    public int doInsertCommonLog(String strMemo) {
        log.info("====난 독립했어요.. CommonLogService.doInsertCommonLog ====");
        //TransactionStatus status = transactionManager.getTransaction(definition);
        int intI=0;
        //try {
            intI = v2Dao.doInsertCommonLog(strMemo);
        //}catch (Exception e){}
        //transactionManager.commit(status);
        return intI;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW) // REQUIRES_NEW 는 별도 클래스로 분리했을경우 사용 적용이 된다.
    public int doInsertCommonLogtransactionManager(String strMemo) {
        log.info("====난 독립했어요.. CommonLogService.doInsertCommonLog ====");
        TransactionStatus status = transactionManager.getTransaction(definition);
        int intI=0;
        //try {
        intI = v2Dao.doInsertCommonLog(strMemo);
        //}catch (Exception e){}
        transactionManager.commit(status);
        return intI;
    }
}
