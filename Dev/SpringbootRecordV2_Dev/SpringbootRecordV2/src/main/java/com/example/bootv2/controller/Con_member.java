package com.example.bootv2.controller;

import com.example.bootv2.comm.Con_encrypt;
import com.example.bootv2.entity.Study_member;
import com.example.bootv2.service.StudyMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/member")
@Slf4j
public class Con_member {

    @Autowired
    StudyMemberService studyMemberService;

    /* 전체 멤버 조회 */
    @GetMapping("/list")
    public String doMemberList(Model model) throws Exception {

        List<Study_member> list = studyMemberService.doSelect();
        model.addAttribute("list", list);

        return  "/member/member_list";
    }



    /* 입력 */
    @GetMapping("/insert")
    public String doIns(){
        //System.out.println("Controller - insert");
        return "/member/member_join";
    }

    /* 등록하기 실행  */
    @PostMapping("/insert_exe")
    public String doInsExe(@ModelAttribute Study_member study_member) throws Exception {

        studyMemberService.doInsert(study_member);

        return "redirect:/member/list";
    }

    /* 수정 - 클릭
    @GetMapping("/modify")
    public String doMod(HttpServletRequest request){
        String strMemberId = request.getParameter("member_id");

        Vo_member vo_member = memberService.doMemberListOne(strMemberId);

        request.setAttribute("vo_member", vo_member);

        return "/member/member_mod";
    }
    */


    /* 수정 - 처리
    @PostMapping("/modify_exe")
    public String doModExe(@ModelAttribute Vo_member vo_member){

        int intI = memberService.doMemberUp(vo_member);

        return "redirect:/home/member_reg";
    }

     */


    /* 삭제 */
    @GetMapping("/delete")
    public String doDel(@RequestParam(value="key_id", defaultValue = "--") String strMemberId){

        studyMemberService.doDelete(Integer.parseInt(strMemberId));

        return "redirect:/member/list";
    }



}
