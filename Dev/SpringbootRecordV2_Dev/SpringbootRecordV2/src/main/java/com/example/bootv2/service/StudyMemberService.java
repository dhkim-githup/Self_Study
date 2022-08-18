package com.example.bootv2.service;

import com.example.bootv2.entity.Study_member;
import com.example.bootv2.entity.Study_record;
import com.example.bootv2.repository.StudyMemberRepository;
import com.example.bootv2.repository.StudyRcordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyMemberService {

    @Autowired
    StudyMemberRepository studyMemberRepository;

    // 전체 조회
    public List<Study_member> doSelect(){
        return studyMemberRepository.findAll();
    }

    // Key 조회 - 1 row
    public Study_member doSelectOneRow(int key_id){
        return studyMemberRepository.findById(key_id).get();
    }

    // 데이타 입력
    public void doInsert(Study_member study_member){
        studyMemberRepository.save(study_member);
    }

    // 데이타 수정
    public void doUpdate(Study_member study_member){

        studyMemberRepository.save(study_member);
    }

    // 데이타 삭제
    public void doDelete(int key_id){

        studyMemberRepository.deleteById(key_id);
    }

}
