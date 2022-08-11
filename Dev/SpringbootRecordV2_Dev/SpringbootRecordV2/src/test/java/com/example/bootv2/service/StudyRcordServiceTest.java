package com.example.bootv2.service;

import com.example.bootv2.entity.Study_record;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyRcordServiceTest {
    
    @Autowired
    StudyRcordService studyRcordService;
    
    @Test
    public void testSelect(){
        
        List<Study_record> list = studyRcordService.doSelect();

        for (Study_record record:list) {
            System.out.println(record.getKey_id());
            System.out.println(record.getStudy_day());
            System.out.println(record.getContents());
            System.out.println(record.getReg_day());
        }
    }

    @Test
    public void testSelectOne(){

        Study_record record = studyRcordService.doSelectOneRow(1);


            System.out.println(record.getKey_id());
            System.out.println(record.getStudy_day());
            System.out.println(record.getContents());
            System.out.println(record.getReg_day());

    }

    @Test
    public void testInsert(){
        Study_record study_record = Study_record.builder()
                .study_day("2022.08.12")
                .contents(("Test Insert 데이타 입력"))
                .reg_day(LocalDateTime.now())
                .build();

        studyRcordService.doInsert(study_record);
    }

    @Test
    public void testUpdate(){

        /* 기존 데이타 가져옮 */
        Study_record record = studyRcordService.doSelectOneRow(1);

        /* 데이타 수정 */
        record.setContents("공부하자 수정");

        studyRcordService.doUpdate(record);
    }

    @Test
    @Transactional // Rollback 처리 가능
    public void testDelete(){

        studyRcordService.doDelete(4);
    }


}