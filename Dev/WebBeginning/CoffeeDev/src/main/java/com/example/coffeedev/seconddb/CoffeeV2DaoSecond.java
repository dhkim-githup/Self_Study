package com.example.coffeedev.seconddb;

import org.apache.ibatis.annotations.Mapper;

/**
 * Coffe V2 관련 Dao ,
 */
@Mapper
public interface CoffeeV2DaoSecond {

    /* Commonlog 기록 */
    int doInsertCommonLog(String strMemo);

    /*
    CREATE TABLE `log` (
	`ID` INT(11) NOT NULL AUTO_INCREMENT,
	`memo` VARCHAR(500) NOT NULL,
	`REG_DAY` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    PRIMARY KEY (`ID`) USING BTREE
    )
    ;
     */
}
