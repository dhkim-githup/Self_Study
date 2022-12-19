package com.iterp.pilot_final.v2.dao;

import com.iterp.pilot_final.v2.vo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HelloDaov2 {
    List<Customer> getCustomer() ;
    int doInsertCst(Customer customer);

    int doDelete(String strNo);

    int doLog();
}
