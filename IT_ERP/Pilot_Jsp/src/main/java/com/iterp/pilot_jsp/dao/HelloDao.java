package com.iterp.pilot_jsp.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HelloDao {

    List<Map<String, Object>> getCustomer();
}
