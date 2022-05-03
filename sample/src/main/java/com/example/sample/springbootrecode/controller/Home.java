package com.example.sample.springbootrecode.controller;

import com.example.sample.springbootrecode.service.StudyService;
import com.example.sample.springbootrecode.vo.Vo_study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/springbootrecode/home")
public class Home {

    @Autowired
    StudyService studyService;

    @GetMapping("")
    public String doHome(){
        return "/springbootrecode/home/home";
    }

    /*
        Vo 객체 사용
     */
    @GetMapping("/study_reg")
    public String doStudy_reg(HttpServletRequest request, Model model){

        List<Vo_study> list = new ArrayList<>();
        list = studyService.doStudyList();

        /*
        System.out.println("vo_study");
        for(Vo_study vo_study : list){
            System.out.println(vo_study.getKeyId());
            System.out.println(vo_study.getStudyDay());
            System.out.println(vo_study.getContents());
            System.out.println(vo_study.getRegDay());
        }
        */


        request.setAttribute("list", list);
        //   model.addAttribute("list", list);

        return  "/springbootrecode/home/study_reg";
    }
    /*
        List<map 사용하기>
     */
    /*
    @GetMapping("/study_reg_bak")
    public String doStudy_reg_bak(HttpServletRequest request, Model model){

        List<Map<String, String>> list = new ArrayList<>();
        list = studyService.doStudyList();

        for(Map<String, String> map : list){
            System.out.println(map.get("KEY_ID"));
            System.out.println(map.get("STUDY_DAY"));
            System.out.println(map.get("CONTENTS"));
            System.out.println(map.get("REG_DAY"));
        }

        model.addAttribute("study", list);
        //request.setAttribute("study",list);

        return  "/springbootrecode/home/study_reg";
    }

     */

    @GetMapping("/member_list")
    public String doMember_list(){
        return "/springbootrecode/home/member_list";
    }
}
