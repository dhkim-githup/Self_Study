package com.example.pilot_war_thymeleaf.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HelloDao {
    List<Map<String, Object>> getCustomer() ;
    int doInsertCst(String strName, String strAge);

    int doDelete(String strNo);
}
