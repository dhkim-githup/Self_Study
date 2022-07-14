package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/form")
    public String showForm(PersonForm personForm) {
        /*
           PersonForm 클래스를 파라메터로 하여, form.html 에서 해당 클래스를 사용할 수 있도록 해준다.
         */
        System.out.println("form1");
        return "form";
    }

    @PostMapping("/form")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
        /*
           PersonForm 클래스를 파라메터로 하며, 해당 파라메터의 validation 체크를 하도록 한다.
           validation 체크의 결과는 BindingResult 를 사용하며,
           해당값이 오류가 있을경우  form.html 에 오류를 전달한다.
         */

        System.out.println("form2");
        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }
}