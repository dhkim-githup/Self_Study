package com.example.coffee.oracledb;

import org.apache.ibatis.annotations.Mapper;

/**
 * Coffe V2 관련 Dao ,
 */
@Mapper
public interface CoffeeV2DaoOracle {

    /* Commonlog 기록 */
    int doInsertCommonLog(String strMemo);

    /*
    create table log(
     memo varchar2(500),
     reg_day date default sysdate
     );
     */
}
