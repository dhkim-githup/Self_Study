package com.guides.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        /* Greeting 클래스를 속성값으로 전달하여 해당 클래스의 멤버변수를
           templates 에서 사용할 수 있도록 한다.
           주의. 매핑은 set , get 뒤의 이름의 소문자로 주고 받는다.
                해당 멤버변수에 직접 매핑하지 않는다는 의미
         */
        model.addAttribute("greeting", new Greeting());

        System.out.println("greeting1");
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit( @ModelAttribute Greeting greeting, Model model) {
          /* @ModelAttribute 어노테이션을 통해 넘어오는 파라메터를
             Greeting 클래스에서 매핑하여 받도록 한다.
             주의. 매핑은 set , get 뒤의 이름의 소문자로 주고 받는다.
                  해당 멤버변수에 직접 매핑하지 않는다는 의미
         */

        System.out.println("greeting2");
        model.addAttribute("greeting", greeting);
        return "result";
    }

}
