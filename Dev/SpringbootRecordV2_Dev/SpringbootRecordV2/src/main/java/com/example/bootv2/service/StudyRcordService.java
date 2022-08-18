package com.example.bootv2.service;

import com.example.bootv2.entity.Study_record;
import com.example.bootv2.repository.StudyRcordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyRcordService {

    @Autowired
    StudyRcordRepository studyRcordRepository;

    // 전체 조회
    public List<Study_record> doSelect(){
        return studyRcordRepository.findAll();
    }

    // Key 조회 - 1 row
    public Study_record doSelectOneRow(int key_id){
        return studyRcordRepository.findById(key_id).get();
    }

    // 데이타 입력
    public void doInsert(Study_record study_record){
        studyRcordRepository.save(study_record);
    }

    // 데이타 수정
    public void doUpdate(Study_record study_record){

        studyRcordRepository.save(study_record);
    }

    // 데이타 삭제
    public void doDelete(int key_id){

        studyRcordRepository.deleteById(key_id);
    }

}
