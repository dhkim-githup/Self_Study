package com.iterp.pilot_jsp.service;

import com.iterp.pilot_jsp.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HelloSvc {

    @Autowired
    HelloDao helloDao;

    public List<Map<String, Object>> getCustomer() {

        List<Map<String,Object>> list =   helloDao.getCustomer();

        return list;

    }
}
