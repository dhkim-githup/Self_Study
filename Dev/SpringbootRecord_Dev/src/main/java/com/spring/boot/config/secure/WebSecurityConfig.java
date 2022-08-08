package com.spring.boot.config.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    HandlerLoginSuccess handlerLoginSuccess;
    @Autowired
    HandlerLoginFailure handlerLoginFailure;
    @Autowired
    HandlerLogoutSuccess handlerLogoutSuccess;
    @Autowired
    HandlerAccesDeny handlerAccesDeny;


    @Override
        protected void configure(HttpSecurity http) throws Exception {
            //System.out.println("==============WebSecurityConfig================");
            http.authorizeRequests()
                    .antMatchers("/","/home/**","/img/**","/docs/**","/comm/**","/secure/login","/member/insert").permitAll()
                    .antMatchers("/study/**").hasAnyRole("MEMBER","ADMIN")
                    .antMatchers("/member/**").hasAnyRole("ADMIN")
                    .anyRequest().authenticated();

            http.formLogin()
                        .loginPage("/secure/login") // custom login
                        //.usernameParameter("username") // default "username"
                        //.passwordParameter("password")  // default "password"
                        .loginProcessingUrl("/secure/login_exe") // default <form action="/login" 이 아닐 경우 명기해준다.
                        //.defaultSuccessUrl("/secure/login_exe") // // successHandler 가 무시된다.
                        .successHandler(handlerLoginSuccess) // 로그인 성공시 수행하는 클래스
                        .failureHandler(handlerLoginFailure)
                        .permitAll();

            http.logout()
                    .logoutSuccessHandler(handlerLogoutSuccess)
                    .logoutSuccessUrl("/")
                    .permitAll();

            http.exceptionHandling()
                    .accessDeniedHandler(handlerAccesDeny); // 인증된 사용자지만, 인가권한이 없을경우 사용

            http.csrf().disable();
        }

}
