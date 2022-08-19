package com.example.bootv2.controller;

import com.example.bootv2.entity.Study_record;
import com.example.bootv2.service.StudyRcordService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/study")
@Log4j2
public class Con_Study {

    @Autowired
    StudyRcordService studyRcordService;

    /* 공부기록 - 조회 */
    @GetMapping("/list")
    public String doStudyList(Model model){

        List<Study_record> list = studyRcordService.doSelect();
        model.addAttribute("list",list);

        return "/study/study_list";
    }

    /* 입력 */
    @GetMapping("/insert")
    public String doIns(){
        return "/study/study_ins";
    }

    /* 등록하기 실행  */
    @PostMapping("/insert_exe")
    public String doInsExe(@ModelAttribute Study_record study_record){

        studyRcordService.doInsert(study_record);

        return "redirect:/study/list";
    }


    /* 수정 */
    @GetMapping("/modify")
    public String doMod(HttpServletRequest request, Model model){
        String strKeyId = request.getParameter("key_id");

        Study_record study_record = studyRcordService.doSelectOneRow(Integer.parseInt(strKeyId));

        //request.setAttribute("vo_study", study_record);
        model.addAttribute("vo_study", study_record);

        return "/study/study_mod";
    }

    /* 수정 */
    @PostMapping("/modify_exe")
    public String doModExe(@ModelAttribute Study_record study_record){

        //study_record.setReg_day(LocalDateTime.now());
        studyRcordService.doInsert(study_record);

        return "redirect:/study/list";
    }


    /* 삭제 */
    @GetMapping("/delete")
    public String doDel(@RequestParam(value="key_id", defaultValue = "--") String strKeyId){

        studyRcordService.doDelete(Integer.parseInt(strKeyId));

        return "redirect:/study/list";
    }
}
