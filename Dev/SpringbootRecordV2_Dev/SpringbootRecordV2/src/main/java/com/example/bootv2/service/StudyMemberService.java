package com.example.bootv2.service;

import com.example.bootv2.comm.Con_encrypt;
import com.example.bootv2.entity.Study_member;
import com.example.bootv2.entity.Study_record;
import com.example.bootv2.repository.StudyMemberRepository;
import com.example.bootv2.repository.StudyRcordRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class StudyMemberService {

    @Autowired
    StudyMemberRepository studyMemberRepository;

    /* application.yml 속성값에서 암호화 key 값 가져온다 */
     @Value("${encrypt.key16}")
    private String strKey16;

    // 전체 조회
    public List<Study_member> doSelect() throws Exception {

        log.info("strKey16 :"+strKey16);
        Con_encrypt conEncrypt = new Con_encrypt();

        List<Study_member> list = studyMemberRepository.findAll();
        //String strEmail="";
        /* 양방향 암호화 - 이메일 */
        for(Study_member study_member : list){
            if(study_member.getEmail() != null) {
                //strEmail = conEncrypt.decryptAes(study_member.getEmail(), "AB123ab456CDcd@#");
                study_member.setEmail(conEncrypt.decryptAes(study_member.getEmail(), strKey16));
            }

        }

        return list;
        //return studyMemberRepository.findAll();

    }

    // Key 조회 - 1 row
    public Study_member doSelectOneRow(int key_id){
        return studyMemberRepository.findById(key_id).get();
    }

    // Key 조회 - 1 row
    public Study_member doSelectLoginId(String strLoginId){
        return studyMemberRepository.findByLoginId(strLoginId);
    }


    // 데이타 입력
    public void doInsert(Study_member study_member) throws Exception {

        Con_encrypt conEncrypt = new Con_encrypt();
        study_member.setPassword(conEncrypt.encryptSHA256(study_member.getPassword()));
        study_member.setEmail(conEncrypt.encryptAes(study_member.getEmail(), strKey16));

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
