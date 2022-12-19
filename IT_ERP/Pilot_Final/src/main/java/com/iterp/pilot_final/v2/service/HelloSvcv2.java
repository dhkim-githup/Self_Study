package com.iterp.pilot_final.v2.service;

import com.iterp.pilot_final.v2.dao.HelloDaov2;
import com.iterp.pilot_final.v2.vo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class HelloSvcv2 {

    @Autowired
    HelloDaov2 helloDao;

    public List<Customer> getCustomer() {
        List<Customer> list = helloDao.getCustomer();

        return list;
    }

    @Transactional
    public int doInsertCst(Customer customer) {

        int intReturn = helloDao.doInsertCst(customer);

        return intReturn;
    }

    public int doDelete(String strNo) {

        int intReturn = helloDao.doDelete(strNo);

        return intReturn;
    }
}
