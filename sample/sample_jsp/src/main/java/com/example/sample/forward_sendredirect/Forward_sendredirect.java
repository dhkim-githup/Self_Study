package com.example.sample.forward_sendredirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("Forward_sendredirect")
public class Forward_sendredirect {

    @GetMapping("/Call")
    public String doGet(HttpServletRequest request, HttpServletResponse response) {

        String strName = request.getParameter("no");

        String strPath = "";

        if ("1".equals(strName)) {
            strPath = "/WEB-INF/views/forward_sendredirect/list";
            RequestDispatcher dispatcher = request.getRequestDispatcher(strPath);
            return strPath;

        } else if ("2".equals(strName)) {
            strPath = "/jsp/list.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(strPath);
            return strPath;

        } else if ("3".equals(strName)) {
            strPath = "https://www.google.com/";
            RequestDispatcher dispatcher = request.getRequestDispatcher(strPath);

            return strPath;

            /* ==================================================================== */
        } else if ("4".equals(strName)) {
            strPath = "/WEB-INF/views/forward_sendredirect/list";
            return "redirect:/" + strPath;

        } else if ("5".equals(strName)) {
            strPath = "/Test/jsp/list.jsp";
            return "redirect:/" + strPath;

        } else if ("6".equals(strName)) {
            strPath = "https://www.google.com/";
            return "redirect:/" + strPath;
        }

        return "";
    }

}
