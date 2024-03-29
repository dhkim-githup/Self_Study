package com.example.coffeedev.v2.service;

import com.example.coffeedev.v2.dao.CoffeeV2Dao;
import com.example.coffeedev.v2.vo.VoCoffeeV2;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Coffe V1 관련 Service, 기본 Default
 */
@Service
@Log4j2
public class CoffeeV2Service_Default {

    @Autowired
    CoffeeV2Dao v2Dao;


    /* 전체 리스트 조회  */
    public List<Map<String, String>> doCoffeeList(){
        List<Map<String, String>> list = v2Dao.doCoffeeList();
        return list;
    }

    /* 전체 리스트 조회 - Overload */
    public List<VoCoffeeV2> doCoffeeList(String strStart_date, String strEnd_date, String strName, String strKind) {
        log.info(strStart_date);
        List<VoCoffeeV2> list = v2Dao.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
        return list;

    }

    public int doInsert(VoCoffeeV2 voCoffeeV2) {
        int intI = v2Dao.doInsert(voCoffeeV2);
        return intI;
    }

    public int doDelete(String strCoffee_id) {
        int intI = v2Dao.doDelete(strCoffee_id);

        return intI;
    }

    /* 1 row 가져오기 */
    public Map<String, String> doListOne(String strCoffee_id) {
        Map<String, String> map = v2Dao.doListOne(strCoffee_id);
        return map;
    }

    /* 수정하기 Post */
    public int doUpdate(VoCoffeeV2 voCoffeeV2) {
        int intI = v2Dao.doUpdate(voCoffeeV2);
        return  intI;
    }

    /* 가격 일괄변경 */

    public int doUpdatePrice(String strPrice, List<String> chkList) {
        int intI  = v2Dao.doUpdatePrice(strPrice, chkList);
        return intI;
    }

    /* 로그기록 */

    public int doInsertLog(String strPrice, List<String> chkList) {
        int intI  = v2Dao.doInsertLog(strPrice, chkList);
        return intI;
    }

    public int doInsertLogOld(String strPrice, String coffee_id) {
        int int1 = v2Dao.doInsertLogOld(strPrice, coffee_id);
        return int1;
    }

    public int doUpdatePriceOld(String strPrice, String coffee_id) {
        int int2 = v2Dao.doUpdatePriceOld(strPrice, coffee_id);
        return int2;
    }

    public int doInsertCommonLog(String strMemo) {
        int int1 = v2Dao.doInsertCommonLog(strMemo);
        return int1;
    }

    /* 가격 일괄 변경 처리
    * https://medium.com/webeveloper/transactional-%EC%9D%80-%EC%96%B4%EB%8A%90-layer-%EC%97%90-%EB%91%90%EB%8A%94%EA%B2%8C-%EB%A7%9E%EC%9D%84%EA%B9%8C-807f50610f0b
    * https://docs.spring.io/spring-framework/docs/3.0.x/spring-framework-reference/html/transaction.html#transaction-declarative-annotations
    * https://goddaehee.tistory.com/m/167
    * */
    //@Transactional(rollbackFor = Exception.class)
    public int doUpdatePriceService(String strPrice, List<String> chkList){

        log.info("strPrice:"+strPrice);
        log.info("chkList:"+chkList);

         int intI=0;

         try {
             if (chkList != null) {
                 // 로그기록
                 intI = doInsertLog(strPrice, chkList);

                 // 가격 일괄변경
                 intI = doUpdatePrice(strPrice, chkList);
             }
         }catch (Exception e) {
             log.info("Exception --- 오류 Line 107");
         }finally {
             intI = doInsertCommonLog("CoffeeV2Service.doUpdatePriceService");
         }

       return intI;
    }




}
