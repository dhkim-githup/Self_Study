package com.example.bootv2.repository;

import com.example.bootv2.entity.Study_member;
import com.example.bootv2.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyMemberRepository extends JpaRepository<Study_member, Integer> {
    //Study_member findByName(String name);

    /**
     * LoginId를 통한 조회, entity 컬럼은 camelType 으로 되어야 함.(아니면 오류남)
     * @param loginID
     * @return Study_member
     */
    Study_member findByLoginId(String loginID);
}
