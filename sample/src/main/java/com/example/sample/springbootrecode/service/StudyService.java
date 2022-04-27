package com.example.sample.springbootrecode.service;


import com.example.sample.springbootrecode.dao.StudyDao;
import com.example.sample.springbootrecode.vo.Vo_study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudyService {

    @Autowired
    StudyDao studyDao;

    /*
    public List<Map<String, String>> doStudyList(){

        List<Map<String, String>> list = new ArrayList<>();
        list = studyDao.doStudyList();
        return  list;

    }
    */
    public List<Vo_study> doStudyList(){

        List<Vo_study> list = new ArrayList<>();
        list = studyDao.doStudyList();
        return  list;

    }
}
