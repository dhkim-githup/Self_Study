package com.example.coffeedev.v1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Dao
 */
@Mapper
public interface CoffeeV1Dao {

    /* 전체 리스트 조회  */
    List<Map<String, String>> doCoffeeList();

    /* 전체 리스트 조회 - Overload */
    List<Map<String, String>> doCoffeeList(
            @Param("strStart_date") String strStart_date, @Param("strEnd_date") String strEnd_date, @Param("strName") String strName, @Param("strKind") String strKind);

    /* 커피 메뉴 등록 */
    int doInsert(String strName, String strKind, String strPrice);

    /* 1 Row 삭제 */
    int doDelete(String strCoffee_id);

    /* 1 Row 가져오기 */
    Map<String, String> doListOne(String strCoffee_id);

    /* 수정하기 Post */
    int doUpdate(String strCoffee_id, String strName, String strKind, String strPrice);


}
