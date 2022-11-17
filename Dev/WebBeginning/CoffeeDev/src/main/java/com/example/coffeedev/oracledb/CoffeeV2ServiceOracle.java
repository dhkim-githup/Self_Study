package com.example.coffeedev.oracledb;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Coffe V1 관련 Service,
 */
@Service
@Log4j2
public class CoffeeV2ServiceOracle {

    @Autowired
    CoffeeV2DaoOracle coffeeV2DaoOracle;

    /* Commonlog 기록 */
    public void doInsertCommonLog(){
        String strMemo = "CoffeeV2ServiceOracle.doInsertCommonLog";
        int intI = coffeeV2DaoOracle.doInsertCommonLog(strMemo) ;
    }




}
