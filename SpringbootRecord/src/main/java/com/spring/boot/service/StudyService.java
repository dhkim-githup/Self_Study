package com.spring.boot.service;

import com.spring.boot.dao.StudyDao;
import com.spring.boot.vo.Vo_study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudyService {

    @Autowired
    StudyDao studyDao;

    public List<Vo_study> doStudyList(){

        List<Vo_study> list = new ArrayList<>();
        list = studyDao.doStudyList();
        return  list;

    }

}
