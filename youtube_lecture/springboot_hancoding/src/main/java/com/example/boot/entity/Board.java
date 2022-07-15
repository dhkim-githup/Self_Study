package com.example.boot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 오라클에 시퀀스를 미리 생성하여 사용하도록 한다.
    private int id;

    private String title;
    private String content;



}
