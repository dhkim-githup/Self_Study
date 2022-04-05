package com.example.sample.request_get;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/RequestGet")
public class Request_get {

    /*

     */
    @PostMapping("/GetParameter")
    public String doGetParameter(HttpServletRequest request){

        String strName = request.getParameter("name");
        String strAge  = request.getParameter("age");

        String strReturn = "doGetParameter > strName : "+strName+"</p>"+"strAge : "+strAge;

        return strReturn;
    }

    /*
      RequestParam
    */
    @PostMapping("/RequestP")
    public String doRequestP(@RequestParam("name") String strName ,
                             @RequestParam("age") String strAge,
                             @RequestParam(value = "novalue", required = true, defaultValue = "Default Value") String strNull){

        String strReturn = "ModelAttribute > strName : "+strName+"</p>strAge : "+strAge+ "</p>strNull : "+strNull ;

        return strReturn;
    }

    /*
        ModelAttribute
        Model model
    */
    @PostMapping("/ModelA")
    public String doModelA(@ModelAttribute("name") String strName ,
                           @ModelAttribute("age") String strAge,
                           Model model){

        System.out.println("model : "+model.getAttribute("name"));
        String strReturn = "ModelAttribute > strName : "+strName+"</p>"+"strAge : "+strAge;
        return strReturn;
    }

    /*
    ModelAttribute
    Model model
*/
    @PostMapping("/ModelVo")
    public String doModelVo(@ModelAttribute RequestVo requestVo){

        String strReturn = "ModelAttribute Vo > Name : "+requestVo.getName()+"</p>"+"Age : "+requestVo.getAge();
        return strReturn;
    }

    /*
        @RequestParam
    */
    @PostMapping("/RequestB")
    public String doRequestB(@RequestBody String strBody){

        String strReturn = "RequestBody > strBody : "+strBody;
        return strReturn;
    }

    /*
    @RequestParam
    */
    @PostMapping("/RequestBVo")
    public String doRequestBVo(@RequestBody RequestVo requestVo){
        System.out.println("========= doRequestBVo ===========");
        String strReturn = "RequestBody Vo > Name : "+requestVo.getName()+"</p>"+"Age : "+requestVo.getAge();
        return strReturn;
    }
}
