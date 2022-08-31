package com.example.bootv2.repository;

import com.example.bootv2.entity.Study_record;
import com.example.bootv2.vo.TwoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudyRcordRepository extends JpaRepository<Study_record, Integer> {

    @Query(value = " SELECT a.* , b.* " +
                   " FROM study_record a, study_member b " +
                   " WHERE a.MEMBER_ID=b.MEMBER_ID"
                    , nativeQuery = true)
    List<Study_record> findJpql();

    @Query(value = "SELECT a.key_id, a.study_day, a.contents, a.member_id , b.name "+
            " FROM study_record a, study_member b " +
            " WHERE a.MEMBER_ID=b.MEMBER_ID"
            , nativeQuery = true)
    List<Study_record> findJpqlVo();
}
