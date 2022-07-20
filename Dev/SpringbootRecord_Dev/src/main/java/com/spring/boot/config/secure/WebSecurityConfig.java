package com.spring.boot.config.secure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/","/home/**","/img/**","/login/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                        .loginPage("/secure/login")
                        .loginProcessingUrl("/secure/login_exe")
                        .defaultSuccessUrl("/secure/login_exe") // // 로그인 성공 후 이동 페이지
                        .permitAll()
                    .and()
                    .logout()
                        .logoutSuccessUrl("/")
                    .permitAll()
                    .and()
                    .csrf().disable();

        }

}
