package com.example.sample.springbootrecode.dao;

import com.example.sample.springbootrecode.vo.Vo_study;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface StudyDao {

    //  public List<Map<String, String>> doStudyList();
    public List<Vo_study> doStudyList();

    //  public List<Map<String, String>> doStudyList();
    public Vo_study doStudyListOne(String strKeyId);

    //  public List<Map<String, String>> doStudyList();
    public int doStudyUpdate(Vo_study vo_study);

    // 등록
    //public int doStudyInsert(Vo_study vo_study);
    public int doStudyInsert(Map<String, String> map);

    // 삭제
    public int doDelete(String keyId);
}
