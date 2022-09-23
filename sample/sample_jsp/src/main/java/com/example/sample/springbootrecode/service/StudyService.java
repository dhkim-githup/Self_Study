package com.example.sample.springbootrecode.service;


import com.example.sample.springbootrecode.dao.StudyDao;
import com.example.sample.springbootrecode.vo.Vo_study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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

    /* 키값을 받아 하나의 row 를 리턴해주는 서비스 */
    public Vo_study doStudyListOne(String strKeyId){

        Vo_study vo_study;
        vo_study = studyDao.doStudyListOne(strKeyId);

        return  vo_study;
    }

    /* 키값을 받아 하나의 row 를 리턴해주는 서비스 */
    public int doStudyUpdate(Vo_study vo_study){

        int intUp = studyDao.doStudyUpdate(vo_study);

        return  intUp;
    }

    /* 등록하기 */
    /*
    public int doStudyInsert(Vo_study vo_study){
        int intUp = studyDao.doStudyInsert(vo_study);
        return  intUp;
    }
    */

    public int doStudyInsert(Map<String, String> map){
        int intUp = studyDao.doStudyInsert(map);
        return  intUp;
    }


    /* 삭제하기 */
    public int doDelete(String keyId){
        int intUp = studyDao.doDelete(keyId);
        return  intUp;
    }

}
