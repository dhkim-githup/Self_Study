package com.iterp.pilot_final.service;

import com.iterp.pilot_final.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class HelloSvc {

    @Autowired
    HelloDao helloDao;

    public List<Map<String, Object>> getCustomer() {
        List<Map<String,Object>> list = helloDao.getCustomer();

        return list;
    }

    @Transactional
    public int doInsertCst(String strName, String strAge) {

        int intReturn = helloDao.doInsertCst(strName,strAge);

        return intReturn;
    }

    public int doDelete(String strNo) {

        int intReturn = helloDao.doDelete(strNo);

        return intReturn;
    }
}