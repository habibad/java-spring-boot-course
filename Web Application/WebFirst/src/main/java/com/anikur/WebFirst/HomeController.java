package com.anikur.WebFirst;

import jakarta.servlet.http.HttpSession;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        System.out.println("controller is calling");
        return "index.jsp";
    }
    @RequestMapping("add")
    public String add(@RequestParam("number1") int num1, @RequestParam("number2") int num2, @NonNull HttpSession session){
        System.out.println("add controller is working");
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }
}
