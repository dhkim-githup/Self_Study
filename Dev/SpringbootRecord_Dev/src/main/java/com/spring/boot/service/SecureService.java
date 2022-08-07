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
import java.util.Collection;
import java.util.List;

@Service
public class SecureService implements UserDetailsService {

    @Autowired
    MemberService memberService;

    @Override
    //public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username : "+username);

        Vo_member vo_member = memberService.doMemberListLogin(username);

        UserDetails userDetails = new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(vo_member.getRole()));
                return authorities;
            }

            @Override
            public String getPassword() {
                return vo_member.getPassword();
                //return "{noop}"+vo_member.getPassword();
            }

            @Override
            public String getUsername() {
                return vo_member.getLoginId();
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };

        return  userDetails;

        /*
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"));
        return new User("1","2",authorities);
        */

        /*
        Vo_member vo_member = memberService.doMemberListLogin(username);

        List<GrantedAuthority> authorities = new ArrayList<>();
        // hasRole ,hasAnyRole 사용을 위해 ROLE_ 를 prefix 함
        authorities.add(new SimpleGrantedAuthority("ROLE_"+vo_member.getRole())); 

        return new User(vo_member.getLoginId(), vo_member.getPassword(),authorities);
        */
        /*
        UserDetails userDetails = new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
                return authorities;
            }

            @Override
            public String getUsername() {

                System.out.println("Break --- User");
                return account.getEmail();
            }

            @Override
            public String getPassword() {

                System.out.println("Break --- Pass");
                return account.getPassword();
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };
         return userDetails;
         */
    }

}
