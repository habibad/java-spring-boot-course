package com.anikur.WebFirst;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute("aid")
    public int displayId(Alien alien){
        return alien.getAid();
    }
    @ModelAttribute("course")
    public String course(){
        return "cse";
    }

    @RequestMapping("/")
    public String Home(){
        System.out.println("controller is calling");
        return "index";
    }
    @RequestMapping("add")
    public String add(@ModelAttribute("alien") Alien alien){
        return "result";
    }
}
