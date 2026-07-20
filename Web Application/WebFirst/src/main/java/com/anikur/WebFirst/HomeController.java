package com.anikur.WebFirst;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String add(@RequestParam("number1") int num1, @RequestParam("number2") int num2, Model model){
        System.out.println("add controller is working");
        int results = num1 + num2;
        model.addAttribute("result", results);
        return "result.jsp";
    }
}
