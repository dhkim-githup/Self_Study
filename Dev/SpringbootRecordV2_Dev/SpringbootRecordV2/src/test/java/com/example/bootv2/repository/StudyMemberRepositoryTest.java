package com.example.bootv2.repository;

import com.example.bootv2.entity.Study_member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyMemberRepositoryTest {

    @Autowired
    StudyMemberRepository studyMemberRepository;

    @Test
    void findByLogin_id() {

        Study_member study_member = studyMemberRepository.findByLoginId("ID3");
        //Study_member study_member = studyMemberRepository.findById(3).get();

        System.out.println(study_member.getMemberId());
        System.out.println(study_member.getLoginId());
        System.out.println(study_member.getName());
        System.out.println(study_member.getRole());


    }
}