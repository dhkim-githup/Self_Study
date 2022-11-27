package com.example.coffee.seconddb;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Coffe V2 관련 Service,
 */
@Service
@Log4j2
public class CoffeeV2ServiceSecond {

    @Autowired
    CoffeeV2DaoSecond coffeeV2DaoSecond;

    /* Commonlog 기록 */
    public void doInsertCommonLog(){
        String strMemo = "CoffeeV2ServiceSecond.doInsertCommonLog";
        int intI = coffeeV2DaoSecond.doInsertCommonLog(strMemo) ;
    }




}
