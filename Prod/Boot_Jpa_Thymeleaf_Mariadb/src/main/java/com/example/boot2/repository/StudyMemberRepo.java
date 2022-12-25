package com.example.boot2.repository;

import com.example.boot2.entity.Study_member;
import com.example.boot2.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyMemberRepo extends JpaRepository<Study_member, Integer> {

    /**
     * LoginId를 통한 조회, entity 컬럼은 camelType 으로 되어야 함.(아니면 오류남)
     * @param loginId
     * @return Study_member
     */
    Study_member findByLoginId(String loginId);
}
