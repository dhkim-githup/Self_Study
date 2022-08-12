package com.example.bootv2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Study_record_Dto {

    private int key_id ;

    private String study_day;

    private String contents;

    private LocalDateTime reg_day;

}
