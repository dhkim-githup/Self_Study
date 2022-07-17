package com.spring.boot.service;

import com.spring.boot.vo.Vo_member;
import com.spring.boot.vo.Vo_study;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void doMemberList() {

        List<Vo_member> list = new ArrayList<>();
        list = memberService.doMemberList();


        System.out.println("vo_member");
        for(Vo_member vo_member : list){
            System.out.println(vo_member.getMemberId());
            System.out.println(vo_member.getLoginId());
            System.out.println(vo_member.getName());
            System.out.println(vo_member.getRole());
        }

    }

    @Test
    void doMemberListOne() {
        Vo_member vo_member=memberService.doMemberListOne("1");
        System.out.println(vo_member.getName());
    }

    @Test
    void doMemberUp() {
        Vo_member vo_member = Vo_member.builder()
                .loginId("Test")
                .password("1234")
                .name("홍길동2")
                .role("MEMBER")
                .build();
        vo_member.setMemberId("1");

        memberService.doMemberUp(vo_member);
    }

    @Transactional
    @Test
    void doMemberDel() {
        int i = memberService.doMemberDel("1");

        assertEquals(1,i);
    }

    @Test
    void doMemberIns() {

        Vo_member vo_member = Vo_member.builder()
                .loginId("hong2")
                .password("1234")
                .name("홍길자")
                .role("MEMBER")
                .build();

        memberService.doMemberIns(vo_member);


    }
}