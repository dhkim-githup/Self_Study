package com.spring.boot.config.secure;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


@RequiredArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    private final  AuthSuccessHandler authSuccessHandler;


    @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/","/home/**","/img/**","/login/**","/docs/**","/sessionInfo").permitAll()
                    .antMatchers("/study/**").hasAnyRole("MEMBER","ADMIN")
                    .antMatchers("/member/**").hasAnyRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                        .loginPage("/secure/login") // custom login
                        //.usernameParameter("username") // default "username"
                        //.passwordParameter("password")  // default "password"
                        .loginProcessingUrl("/secure/login_exe") // default <form action="/login" 이 아닐 경우 명기해준다.
                        //.defaultSuccessUrl("/secure/login_exe") // // 로그인 성공 후 이동 페이지
                        .successHandler(authSuccessHandler) // 로그인 성공시 수행하는 클래스
                        .permitAll()
                    .and()
                    .logout()
                        .logoutSuccessUrl("/")
                    .permitAll()
                    .and()
                    .csrf().disable(); // csrf 기능 정지

        }


}
