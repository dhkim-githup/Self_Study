package com.example.bootv2.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
public class TwoTable {

    private String studyDay;

    private String contents;

    private int memberId;

    private String name;
}
