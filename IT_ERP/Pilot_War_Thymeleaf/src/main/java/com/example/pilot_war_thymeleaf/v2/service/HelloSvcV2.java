package com.example.pilot_war_thymeleaf.v2.service;

import com.example.pilot_war_thymeleaf.v2.dao.HelloDaoV2;
import com.example.pilot_war_thymeleaf.v2.vo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloSvcV2 {

    @Autowired
    HelloDaoV2 helloDao;

    public List<Customer> getCustomer() {
        List<Customer> list = helloDao.getCustomer();

        return list;
    }

    public int doInsertCst(Customer customer) {

        int intReturn = helloDao.doInsertCst(customer);

        return intReturn;
    }

    public int doDelete(String strNo) {

        int intReturn = helloDao.doDelete(strNo);

        return intReturn;
    }
}
