package com.example.coffee.v2.service;


import com.example.coffee.v2.dao.CoffeeV2Dao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
public class CommonLogService {

    @Autowired
    CoffeeV2Dao v2Dao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int doInsertCommonLog(String strMemo) {

        log.info("====난 독립했어요.. CommonLogService.doInsertCommonLog ====");

        int int1 = v2Dao.doInsertCommonLog(strMemo);
        return int1;
    }
}
