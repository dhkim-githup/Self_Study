package com.example.bootv2.controller;

import com.example.bootv2.entity.Study_record;
import com.example.bootv2.service.StudyRcordService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/studyV2")
@Log4j2
public class Con_Study_v2 {

    @Autowired
    StudyRcordService studyRcordService;

    /* 공부기록 - 조회 */
    @GetMapping("/list")
    public String doStudyList(Model model){

        List<Study_record> list = studyRcordService.doSelect();
        model.addAttribute("list",list);

        return "/studyV2/study_list_v2";
    }

}
