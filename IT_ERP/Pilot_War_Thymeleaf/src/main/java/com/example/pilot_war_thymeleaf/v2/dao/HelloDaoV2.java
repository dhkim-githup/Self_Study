package com.example.pilot_war_thymeleaf.v2.dao;


import com.example.pilot_war_thymeleaf.v2.vo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloDaoV2 {
    List<Customer> getCustomer() ;
    int doInsertCst(Customer customer);

    int doDelete(String strNo);
}
