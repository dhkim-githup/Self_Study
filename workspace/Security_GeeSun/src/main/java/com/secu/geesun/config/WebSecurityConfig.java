package com.secu.geesun.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    LoginHandlerSuccess loginHandlerSuccess;
    @Autowired
    LoginHandlerFailure loginHandlerFailure;
    @Autowired
    LogoutHandlerSuccess logoutHandlerSuccess;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/home","/create").permitAll()
                //.antMatchers("/member").hasAnyAuthority("MEMBER")
                .antMatchers("/member").hasRole("MEMBER")
                .antMatchers("/admin").hasAnyRole("ADMIN","MEMBER")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .successHandler(loginHandlerSuccess) // 성공 시 처리 가능한 공간
                .failureHandler(loginHandlerFailure) // 실패 시 처리 가능한 공간
                .defaultSuccessUrl("/home") // 요게 지정되면 위 success 가 실행되지 않는다.
                .permitAll()
                .and()
            .logout()
                .logoutSuccessUrl("/home")
                .logoutSuccessHandler(logoutHandlerSuccess)
                .permitAll();
    }

    /*
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("password")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
    */

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}