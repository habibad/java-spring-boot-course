package com.anikur.WebFirst;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        System.out.println("controller is calling");
        return "index.jsp";
    }
    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session){
        System.out.println("add controller is working");
        int num1 = Integer.parseInt(req.getParameter("number1"));
        int num2 = Integer.parseInt(req.getParameter("number2"));
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }
}
