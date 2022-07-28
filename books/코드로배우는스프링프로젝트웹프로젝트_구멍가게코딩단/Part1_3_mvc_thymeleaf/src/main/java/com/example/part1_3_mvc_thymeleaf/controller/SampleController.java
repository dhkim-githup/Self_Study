package com.example.part1_3_mvc_thymeleaf.controller;

import com.example.part1_3_mvc_thymeleaf.dto.SampleDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @GetMapping("/ex1")
    public void doEx1(){
        log.info("ex1...............");
        //return "/sample/ex1";
        //System.out.println("----------- do Ex1 ===============");
    }

    /*
    @GetMapping({"/ex2"})
    public String doEx2(Model model){

        List<SampleDTO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj(i -> {
            SampleDTO sampleDTO = SampleDTO.builder()
                    .sno(i)
                    .first("First.."+i)
                    .last("last .. "+i)
                    .regTime(LocalDateTime.now())
                    .build();
            return sampleDTO;
        }).collect(Collectors.toList());

        model.addAttribute("list", list);

        return "/sample/ex2";
    }
    */
    /* 다중 매핑  {"",""} */
    @GetMapping({"/ex2", "/exLink"})
    public void exModel(Model model){

        List<SampleDTO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj(i -> {
            SampleDTO dto = SampleDTO.builder()
                    .sno(i)
                    .first("First.."+i)
                    .last("Last.."+i)
                    .regTime(LocalDateTime.now())
                    .build();
            return dto;
        }).collect(Collectors.toList());

        model.addAttribute("list", list);
    }

    @GetMapping({"/exInline"})
    public String exInline(RedirectAttributes redirectAttributes){

        log.info("exInline..............");

        SampleDTO dto = SampleDTO.builder()
                .sno(100L)
                .first("First..100")
                .last("Last..100")
                .regTime(LocalDateTime.now())
                .build();
        redirectAttributes.addFlashAttribute("result", "success");
        redirectAttributes.addFlashAttribute("dto", dto);


        return "redirect:/sample/ex3";
    }

    @GetMapping("/ex3")
    public void doEx3(){
        log.info("ex3");
    }
}
