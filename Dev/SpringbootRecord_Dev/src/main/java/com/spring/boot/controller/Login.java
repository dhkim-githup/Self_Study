package com.spring.boot.controller;

import com.spring.boot.service.MemberService;
import com.spring.boot.vo.Vo_member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class Login {

    @Autowired
    MemberService memberService;

    @GetMapping("/login")
    public String doStudy_reg(){
        System.out.println("Login----");
        return "/login/loginForm";
    }

    @PostMapping("/login_exe")
    public String doMember_join(@RequestParam(value="loginId", defaultValue = "--") String strLoginId,
                                @RequestParam(value="password", defaultValue = "--") String strPassword,
                                Model model,
                                HttpServletRequest request){

        String strReturn="";
        String strMessage = "";
        boolean bl_login=false; // 로그인 성공 여부

        Vo_member vo_member = memberService.doMemberListLogin(strLoginId);

        if (vo_member==null){
            strMessage="ID가 존재하지 않아요.";
            strReturn = "/login/loginForm";
        }else{
            if(!strPassword.equals(vo_member.getPassword())) {
                System.out.println(strPassword+"::"+vo_member.getPassword());
                strMessage = "패스워드가 일치하지 않아요.";
                strReturn = "/login/loginForm";
            }else{
                strMessage = "Login 성공";
                strReturn = "redirect:/";
                bl_login  = true;
            }
        }

        model.addAttribute("message", strMessage);
        System.out.println(strMessage+"::"+strReturn);

        /* 세션처리 - setSession
            1. getSession(), getSession(true)
               - HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 세션을 생성합니다
            2. getSession(false)
               - HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 생성하지 않고 그냥 null을 반환합니다
         */
        HttpSession session = request.getSession();
        if( bl_login  == true) {
            session.setAttribute("ss_member_id", vo_member.getMemberId());
            session.setAttribute("ss_login_id", vo_member.getLoginId());
            session.setAttribute("ss_name", vo_member.getName());
            session.setAttribute("ss_role", vo_member.getRole());
        }

        return strReturn;
    }

    /* Log out */
    @GetMapping("/logout")
    public String doLogout(HttpServletRequest request){

        HttpSession session = request.getSession(false);
        session.invalidate();
        return "redirect:/";
    }
}
