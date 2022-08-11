package com.example.bootv2.repository;

import com.example.bootv2.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRcordRepository extends JpaRepository<Study_record, Integer> {

}
