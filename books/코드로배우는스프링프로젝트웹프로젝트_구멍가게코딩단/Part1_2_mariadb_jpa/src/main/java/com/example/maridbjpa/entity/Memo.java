package com.example.maridbjpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity // 해당 클래스가 jpa에서 사용할거라는 선언, 자동으로 테이블/컬럼도 생성할 수 있음
@Table(name="tbl_memo") // 테이블 생성시 테이블 명을 선언함
@ToString
@Getter
@Builder // 빌더 생성시 아래 두개 어노테이션을 선언해야 오류가 발생하지않음
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id // Primary key 값으로 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 사용자가 값을 입력하지 않고, 자동으로 값이 입력됨
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
