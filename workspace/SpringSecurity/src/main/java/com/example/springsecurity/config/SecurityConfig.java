package com.example.springsecurity.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Slf4j
@Order(0)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //WebSecurityConfigurerAdapter -- 커스텀 방식 적용을 위해 상속

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                    .antMatchers("/user/**").authenticated() // 대상
                .anyRequest().permitAll()
                //.anyRequest().authenticated()
                    .and()
                .formLogin()
                    .and()
                .logout()
                    .and()
                .csrf().disable()
                ;
    }
}

/*
@Configuration
@Slf4j
@Order(1)
class DefaultSecurityConfig extends WebSecurityConfigurerAdapter {
    //WebSecurityConfigurerAdapter -- 커스텀 방식 적용을 위해 상속

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .antMatcher("**") // 대상
                .authorizeRequests()
                //.anyRequest().permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .logout()
                .and()
                .csrf().disable()
        ;
    }

}
 */
