package com.example.pilot_war_thymeleaf.service;

import com.example.pilot_war_thymeleaf.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public int doInsertCst(String strName, String strAge) {

        int intReturn = helloDao.doInsertCst(strName,strAge);

        return intReturn;
    }

    public int doDelete(String strNo) {

        int intReturn = helloDao.doDelete(strNo);

        return intReturn;
    }
}
