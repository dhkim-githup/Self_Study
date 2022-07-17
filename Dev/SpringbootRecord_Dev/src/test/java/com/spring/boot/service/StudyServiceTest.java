package com.spring.boot.service;


import com.spring.boot.vo.Vo_study;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudyServiceTest {

    @Autowired
    StudyService studyService;

    @Test
    void doStudyList() {

        List<Vo_study> list = new ArrayList<>();
        list = studyService.doStudyList();


        System.out.println("vo_study");
            for(Vo_study vo_study : list){
                System.out.println(vo_study.getKeyId());
                System.out.println(vo_study.getStudyDay());
                System.out.println(vo_study.getContents());
                System.out.println(vo_study.getRegDay());
            }
    }

    @Test
    void doStudyListOne() {
    }

    @Test
    //@Transactional // 실행 후 롤백처리를 한다.
    void doStudyUp() {

        Vo_study vo_study = new Vo_study();

        vo_study.setKeyId("1001");
        vo_study.setStudyDay("2022.07.16");
        vo_study.setContents("Tool 설명 - 수정-10");

        studyService.doStudyUp(vo_study);
    }

    @Test
    void doStudyDel() {
    }

    @Test
    void doStudyIns() {
    }
}