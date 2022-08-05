package com.spring.boot.config.secure;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@Component
public class HandlerLoginFailure implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        System.out.println("-- onAuthenticationFailure --"+ exception.getMessage());
        String strErrorMsg = exception.getMessage();

        String strMsg="";
        if(strErrorMsg==null){
            strMsg = "입력하신 계정을 찾지 못했습니다.";
        }else{
            strMsg = exception.getMessage()+"(비밀번호를 체크해 주세요.)";
        }
        System.out.println("strMsg : "+strMsg);

        strMsg= URLEncoder.encode(strMsg,"UTF-8");//한글 인코딩 깨지는 문제 방지
        String strUrl="/secure/login?error=true&message=";


        // 로그인 페이지로 다시 포워딩
        response.sendRedirect(strUrl +strMsg);
        // https://anjoliena.tistory.com/107
        /*
        request.setAttribute("message", strMsg);
        request.getRequestDispatcher(strUrl)
                .forward(request, response);
        */
        //setDefaultFailureUrl("/secure/login?message="+strMsg);
        //super.onAuthenticationFailure(request, response, exception);
        //https://velog.io/@dasd412/2.%EC%8A%A4%ED%94%84%EB%A7%81-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EC%8B%A4%ED%8C%A8-%ED%95%B8%EB%93%A4%EB%A7%81%ED%95%98%EA%B8%B0

    }

}