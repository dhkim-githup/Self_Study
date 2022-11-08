package com.example.coffee.v2.service;

import com.example.coffee.comm.MyExceptionRuntime;
import com.example.coffee.v2.dao.CoffeeV2Dao;
import com.example.coffee.v2.vo.VoCoffeeV2;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class CoffeeV2Service {

    @Autowired
    CoffeeV2Dao v2Dao;

    @Autowired
    CommonLogService commonLogService;

    /* 전체리스트 조회 */
    public List<Map<String, String>> doCoffeeList() {
        List<Map<String, String>> list = v2Dao.doCoffeeList();
        return list;
    }

    /* 전체리스트 - 오버로딩 함수 사용 */
    public List<VoCoffeeV2> doCoffeeList(String strStart_date, String strEnd_date, String strName, String strKind) {
        List<VoCoffeeV2> list = v2Dao.doCoffeeList(strStart_date,strEnd_date,strName,strKind);
        return list;

    }

    /* 데이타 입력 */
    public int doInsert(VoCoffeeV2 voCoffeeV2) {
        int intI = v2Dao.doInsert(voCoffeeV2);
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

    /* 데이타 삭제 */
    public int doDelete(String strCoffee_id) {
        int intI = v2Dao.doDelete(strCoffee_id);

        return intI;
    }

    /* 가격 수정 히스토리 로그 입력 */
    public int doInsertLogOld(String strPrice, String coffee_id) {
        int int1 = v2Dao.doInsertLogOld(strPrice, coffee_id);
        return int1;
    }

    /* 가격 일괄 수정 처리 */
    public int doUpdatePriceOld(String strPrice, String coffee_id) {
        int int2 = v2Dao.doUpdatePriceOld(strPrice, coffee_id);
        return int2;
    }

    /* 가격 수정 일괄처리 히스토리 로그 입력 v2 */
    public int doInsertLog(String strPrice, List<String> chkList) {
        int int1 = v2Dao.doInsertLog(strPrice, chkList);
        return int1;
    }

    /* 가격 일괄 수정 처리 v2 */
    public int doUpdatePrice(String strPrice, List<String> chkList) {
        int int2 = v2Dao.doUpdatePrice(strPrice, chkList);
        return int2;
    }

    /* 로그 넣는 부분 */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int doInsertCommonLog(String strMemo) {
        log.info("우린 같은 클래스...=================== 같은 클래스. doInsertCommonLog");
        int int1 = v2Dao.doInsertCommonLog(strMemo);
        return int1;
    }

    //@Transactional(rollbackFor = Exception.class)
    @Transactional
    public int doUpdatePriceService(String strPrice, List<String> chkList) throws MyExceptionRuntime {
        int intI=0;

        try {
            if (chkList != null) {
                intI = doInsertLog(strPrice, chkList);
                intI = doUpdatePrice(strPrice, chkList);

                /*if (intI > 0) {
                    throw new MyExceptionRuntime("Update 1개 이상이여서 오류발생", "CoffeeV2Service.doUpdatePriceService");
                }*/
            }
        }catch (Exception e){
            throw new MyExceptionRuntime("예상치 못한 오류 발생 : "+e.getMessage(), "CoffeeV2Service.doUpdatePriceService");
        }finally {
            // 로그를 넣자.
            //intI = doInsertCommonLog("CoffeeV2Service.doUpdatePriceService");
            intI = commonLogService.doInsertCommonLog("CoffeeV2Service.doUpdatePriceService");
        }
        return intI;
    }


}
