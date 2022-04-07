package com.example.j106;

import com.example.j106.domain.Member;
import com.example.j106.domain.Role;
import com.example.j106.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@Slf4j
@Commit
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMemberRepository {

        @Autowired
        private MemberRepository memberRepository;


        @Test
        public void A001_사용자_등록() {
            Member member = new Member();
            member.setId("admin");
            member.setPassword("admin");
            member.setDname("admin 부서");
            member.setEnabled(true);
            member.setRole(Role.ROLE_ADMIN);
            memberRepository.save(member);

            member = new Member();
            member.setId("manager");
            member.setPassword("manager");
            member.setDname("manager 부서");
            member.setEnabled(true);
            member.setRole(Role.ROLE_MANAGER);
            memberRepository.save(member);

            member = new Member();
            member.setId("member");
            member.setPassword("member");
            member.setDname("member 부서");
            member.setEnabled(true);
            member.setRole(Role.ROLE_MEMBER);
            memberRepository.save(member);

        }
}