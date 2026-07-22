package com.anikur.WebFirst;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        System.out.println("controller is calling");
        return "index";
    }
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView modelAndView){
        Alien alien = new Alien();
        alien.setId(aid);
        alien.setName(aname);
        modelAndView.addObject("alien", alien);
        modelAndView.setViewName("result");
       return modelAndView;
    }
}
