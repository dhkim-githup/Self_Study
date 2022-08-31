package com.example.bootv2.repository;

import com.example.bootv2.entity.Study_record;
import com.example.bootv2.vo.TwoTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyRcordRepositoryTest {

    @Autowired
    StudyRcordRepository studyRcordRepository;

    //@Transactional // FetchType.LAZY 설정 시 필수사용
    @Test
    public void doTest(){
       Study_record record = studyRcordRepository.findById(26).get();

        System.out.println("======== Line 1 =====");
        System.out.println(record);
        System.out.println("======== Line 2 =====");
        System.out.println(record.getStudy_member().getName());

        System.out.println("======== Line 3 =====");
        //List<Study_record> list = studyRcordRepository.findAll();
        List<Study_record> list = studyRcordRepository.findJpql();
        System.out.println(list);

        /*
        System.out.println("======== Line 4 =====");
        //List<Study_record> list = studyRcordRepository.findAll();
        List<Study_record> list2 = studyRcordRepository.findJpqlVo();
        System.out.println(list2);
        */
    }

}