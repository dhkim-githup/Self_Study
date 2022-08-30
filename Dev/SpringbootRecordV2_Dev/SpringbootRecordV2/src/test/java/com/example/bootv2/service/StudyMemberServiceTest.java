package com.example.bootv2.service;

import com.example.bootv2.entity.Study_member;
import com.example.bootv2.entity.Study_record;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyMemberServiceTest {

    @Autowired
    StudyMemberService service;

    @Test
    void doTest() {

        //Study_member study_member = service.doSelectOneRowSearch("ID3");
        Study_member study_member = service.doSelectOneRow(3);
            System.out.println(study_member.getMemberId());
            System.out.println(study_member.getLoginId());
            System.out.println(study_member.getName());
            System.out.println(study_member.getRole());
            
    }
}