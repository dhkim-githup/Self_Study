package com.spring.boot.service;

import com.spring.boot.vo.Vo_member;
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
public class SecureService implements UserDetailsService {

    @Autowired
    MemberService memberService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username"+username);
        Vo_member vo_member = memberService.doMemberListLogin(username);

        List<GrantedAuthority> authorities = new ArrayList<>();
        // hasRole ,hasAnyRole 사용을 위해 ROLE_ 를 prefix 함
        authorities.add(new SimpleGrantedAuthority("ROLE_"+vo_member.getRole())); 

        return new User(vo_member.getLoginId(), vo_member.getPassword(),authorities);
    }

}
