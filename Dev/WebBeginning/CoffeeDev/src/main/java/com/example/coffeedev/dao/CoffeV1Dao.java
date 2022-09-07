package com.example.coffeedev.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Dao
 */
@Mapper
public interface CoffeV1Dao {

    /* 전체 리스트 조회  */
    List<Map<String, String>> doCoffeList();

    /* 커피 메뉴 등록 */
    int doInsert(String strName, String strKind, String strPrice);

    /* 1 Row 삭제 */
    int doDelete(String strCoffee_id);

    /* 1 Row 가져오기 */
    Map<String, String> doListOne(String strCoffee_id);

    /* 수정하기 Post */
    int doUpdate(String strCoffee_id, String strName, String strKind, String strPrice);
}
