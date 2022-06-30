package com.example.security.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated();

        http.formLogin()
                .loginPage("/loginForm")             // default : /login
                .loginProcessingUrl("/login_security")
                .failureUrl("/loginError")             // default : /login?error
                .defaultSuccessUrl("/home")
                //.usernameParameter("j_username")    // default : j_username
                //.passwordParameter("j_password")     // default : j_password
                .permitAll();

        http.logout()
                .logoutUrl("/logout") // default
                .logoutSuccessUrl("/loginForm")
                .permitAll();

        // 개발중에는 꺼 놓는다.
        //http.csrf().disable();
    }

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
}