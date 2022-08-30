package com.example.boot2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "STUDY_MEMBER")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Study_member {

    /*
        IDENTITY - @GeneratedValue(strategy = GenerationType.IDENTITY)
                    기본키 생성을 데이터베이스에게 위임하는 방식으로 id값을 따로 할당하지 않아도 데이터베이스가 자동으로 AUTO_INCREMENT를 하여 기본키를 생성해준다.
        SEQUENCE - @GeneratedValue(strategy = GenerationType.SEQUNCE)
                    데이터 베이스의 Sequence Object를 사용하여 데이터베이스가 자동으로 기본키를 생성해준다.
                   @SequenceGenerator 어노테이션이 필요하다.
        TABLE - @GeneratedValue(strategy = GenerationType.TABLE)
        AUTO - @GeneratedValue(strategy = GenerationType.AUTO)
                기본 설정 값으로 각 데이터베이스에 따라 기본키를 자동으로 생성한다.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private int memberId ;

    @Column(name = "login_id")
    private String loginId;

    private String password;

    private String name;

    private String email;

    private String role;

    /*
    INSERT
        주어진 속성값은 insert 될 때 생성된다. 그러나 이후 엔티티가 업데이트될 때는 속성값이 재생성되지 않는다.
        creationTimestamp와 같은 속성이 이 범주에 속한다.
    ALWAYS
        insert, update할 때 모두 속성값이 생성된다.
        출처: https://anomie7.tistory.com/88 [마지막의 마지막까지 다하는 최선:티스토리]
     */
    @org.hibernate.annotations.Generated(GenerationTime.INSERT)
    private LocalDateTime regDay;


}
