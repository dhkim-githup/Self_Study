package com.spring.boot.dao;

import com.spring.boot.vo.Vo_study;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudyDao {

    public List<Vo_study> doStudyList();

}
