package com.example.coffeedev.v2.dao;

import com.example.coffeedev.v2.vo.VoCoffeeV2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Coffe V2 관련 Dao
 */
@Mapper
public interface CoffeeV2Dao {

    /* 전체 리스트 조회  */
    List<Map<String, String>> doCoffeeList();

    /* 전체 리스트 조회 - Overload */
    List<VoCoffeeV2> doCoffeeList(
            @Param("strStart_date") String strStart_date, @Param("strEnd_date") String strEnd_date, @Param("strName") String strName, @Param("strKind") String strKind);

    /* 커피 메뉴 등록 */
    int doInsert(VoCoffeeV2 voCoffeeV2);

    /* 1 Row 삭제 */
    int doDelete(String strCoffee_id);

    /* 1 Row 가져오기 */
    Map<String, String> doListOne(String strCoffee_id);

    /* 수정하기 Post */
    int doUpdate(VoCoffeeV2 voCoffeeV2);

    /* 가격 변경 - 다중처리 */
    int doUpdatePrice(String strPrice, List<String> chkList);

    /* 로그기록 */
    int doInsertLog(String strPrice, List<String> chkList);

    /* 1 개값 Insert */
    int doInsertLogOld(@Param("strPrice") String strPrice, @Param("coffee_id") String coffee_id);

    /* 1 개값 수정 */
    int doUpdatePriceOld(@Param("strPrice") String strPrice, @Param("coffee_id") String coffee_id);
}
