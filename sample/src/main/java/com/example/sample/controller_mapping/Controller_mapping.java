package com.example.sample.controller_mapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/RequestMapping")
public class Controller_mapping {

    /* 가장 기본적인 형태 */
    @RequestMapping("/Base")
    public String doDefault(){
        return "result";
    }

    /* Return View 가 없이 여기서 Response 처리, 초기 Servlet 방식 */
    @RequestMapping("/Self")
    public void doSelf(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(" View : response Self <HR>");
        out.println("</body></html>");
    }

    /* 좀더 진보된 Response 처리 */
    @RequestMapping("/Responsebody")
    @ResponseBody
    public String doResponsebody() {
        String strContents = "View : Responsebody!! <HR>";
        return strContents;
    }
}
