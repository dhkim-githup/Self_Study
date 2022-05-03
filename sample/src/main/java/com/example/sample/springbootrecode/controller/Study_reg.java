package com.example.sample.springbootrecode.controller;

import com.example.sample.springbootrecode.service.StudyService;
import com.example.sample.springbootrecode.vo.Vo_study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/springbootrecode/study_reg")
public class Study_reg {

    @Autowired
    StudyService studyService;

    /*
     * 수정하는 화면으로 이동
     */
    @GetMapping("/modify")
    public String doModify(HttpServletRequest request,
                           @RequestParam(value = "flag", defaultValue = "UP") String flag){
        Vo_study vo_study = new Vo_study();

       if("UP".equals(flag)) {
            String strKeyId = request.getParameter("key_id");
            System.out.println("strKeyId : " + strKeyId);

            vo_study = studyService.doStudyListOne(strKeyId);
        }
        request.setAttribute("voStudy", vo_study);
        request.setAttribute("flag", flag);
        return "/springbootrecode/study_reg/study_reg_modify";
    }

    /*
     * 실제 수정하는 처리 구문
     */
    @PostMapping("/modify_exec")
    public String doModify_Exec(HttpServletRequest request,
                                @ModelAttribute Vo_study vo_study,
                                @RequestParam(value = "flag", defaultValue = "--") String strFlag
                                ){
        String strKeyId = request.getParameter("keyId");
        System.out.println("strKeyId : "+strKeyId);

        String strKeyId2 = vo_study.getKeyId();
        System.out.println("strKeyId2 : "+strKeyId2);

        System.out.println("strFlag : "+strFlag);

        int intUp=0;
        /* 수정 */
        if("UP".equals(strFlag)) {
            intUp = studyService.doStudyUpdate(vo_study);
        /* 등록 */
        }else if("IN".equals(strFlag)) {
            //intUp = studyService.doStudyInsert(vo_study);
            Map<String, String> map = new HashMap<>();
            map.put("MapstudyDay", vo_study.getStudyDay());
            map.put("Mapcontents", vo_study.getContents());

            intUp = studyService.doStudyInsert(map);
        }
        System.out.println("intUp : "+intUp);

        return "redirect:/springbootrecode/home/study_reg";
    }

    /*
     * 등록 버튼 눌렀을때
     */
    @GetMapping("/insert")
    public String doInsert(){
        return "redirect:/springbootrecode/study_reg/modify?flag=IN";
    }



    /*
     * 실제 수정하는 처리 구문
     */
    @GetMapping("/IdDelete")
    public String doDelete( @RequestParam(value = "key_id", defaultValue = "--") String keyId){
        int    intUp = studyService.doDelete(keyId);
        return "redirect:/springbootrecode/home/study_reg";
    }


}
