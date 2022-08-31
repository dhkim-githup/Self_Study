package com.example.bootv2.config.secure;

import com.example.bootv2.entity.Study_member;
import com.example.bootv2.service.StudyMemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class SecureUser implements UserDetailsService {

    @Autowired
    StudyMemberService memberService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("=== SecureUser >> loadUserByUsername ====== ");
        Study_member vo_member = memberService.doSelectLoginId(username);

        log.info("=== Study_member >> "+vo_member);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(vo_member.getRole()));

        log.info("=== authorities >> "+authorities);
        //return new User(vo_member.getLoginId(), "{noop}"+vo_member.getPassword(), authorities);
        //return new User(vo_member.getLoginId(), vo_member.getPassword(), authorities);
        return new User(vo_member.getLoginId(), "{SHA-256}"+vo_member.getPassword(), authorities);

    }
}
