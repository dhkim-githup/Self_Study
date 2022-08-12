package com.example.bootv2.service;

import com.example.bootv2.entity.Study_record;
import com.example.bootv2.entity.Study_record_Dto;
import com.example.bootv2.repository.StudyRcordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyRcordServiceUseDto {

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

    // Study_record -> Study_record_Dto 변환
    public Study_record dtoToEntity(Study_record_Dto dto){
        Study_record study_record = Study_record.builder()
                .key_id(dto.getKey_id())
                .study_day(dto.getStudy_day())
                .contents(dto.getContents())
                .reg_day(dto.getReg_day())
                .build();
        return study_record;
    }

    // Study_record -> Study_record_Dto 변환
    public Study_record_Dto entityToDto(Study_record study_record){
        Study_record_Dto study_record_dto = Study_record_Dto.builder()
                .key_id(study_record.getKey_id())
                .study_day(study_record.getStudy_day())
                .contents(study_record.getContents())
                .reg_day(study_record.getReg_day())
                .build();
        return study_record_dto;
    }
}
