package com.spring.boot.config.secure;

import com.spring.boot.service.MemberService;
import com.spring.boot.vo.Vo_member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class AuthSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    MemberService memberService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
                                        throws IOException, ServletException {
        System.out.println(" ------- onAuthenticationSuccess --------");

        Vo_member vo_member = memberService.doMemberListLogin(authentication.getName());

        HttpSession session = request.getSession();
            session.setAttribute("ss_member_id", vo_member.getMemberId());
            session.setAttribute("ss_login_id", vo_member.getLoginId());
            session.setAttribute("ss_name", vo_member.getName());
            session.setAttribute("ss_role", vo_member.getRole());

        response.sendRedirect("/");

    }

//    https://galid1.tistory.com/698

}
