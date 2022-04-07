package com.example.sample.request_get;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/RequestGet")
public class Request_get {

    /*
        HttpServletRequest
     */
    @PostMapping("/GetParameter")
    @ResponseBody
    public String doGetParameter(HttpServletRequest request){

        String strName = request.getParameter("name");
        String strAge  = request.getParameter("age");

        String strReturn = "request.getParameter  </p>strName : "+strName+"</p>"+"strAge : "+strAge;

        return strReturn;
    }

    /*
        RequestParam
    */
    @PostMapping("/RequestP")
    @ResponseBody
    public String doRequestP(@RequestParam("name") String strName ,
                             @RequestParam("age") String strAge,
                             @RequestParam(value = "novalue", required = true, defaultValue = "Default Value") String strNull){

        String strReturn = "@RequestParam  </p>strName : "+strName+"</p>strAge : "+strAge+ "</p>strNull : "+strNull ;

        return strReturn;
    }

    /*
        ModelAttribute
        Model model
    */
    @PostMapping("/ModelA")
    @ResponseBody
    public String doModelA(@ModelAttribute("name") String strName ,
                           @ModelAttribute("age") String strAge,
                           Model model){

        System.out.println("model : "+model.getAttribute("name"));
        String strReturn = "@ModelAttribute  </p>strName : "+strName+"</p>"+"strAge : "+strAge;
        return strReturn;
    }

    /*
    ModelAttribute
    Model model
*/
    @PostMapping("/ModelVo")
    @ResponseBody
    public String doModelVo(@ModelAttribute RequestVo requestVo){

        String strReturn = "@ModelAttribute Vo  </p>Name : "+requestVo.getName()+"</p>"+"Age : "+requestVo.getAge();
        return strReturn;
    }

    /*
        @RequestBody
    */
    @PostMapping("/RequestB")
    @ResponseBody
    public String doRequestB(@RequestBody String strBody){

        String strReturn = "@RequestBody  </p>strBody : "+strBody;
        return strReturn;
    }

    /*
        @RequestBody
    */
    @PostMapping("/RequestBVo")
    public String doRequestBVo(@RequestBody RequestVo requestVo){
        System.out.println("========= doRequestBVo ===========");
        String strReturn = "@RequestBody Vo  </p>Name : "+requestVo.getName()+"</p>"+"Age : "+requestVo.getAge();
        return "redirect:/html/request_get/result.html";
    }
}
