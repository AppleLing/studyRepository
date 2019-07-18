package com.study.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")
@Controller
public class IndexController {

    @GetMapping("hello")
    public String index(Model model){
        model.addAttribute("title","thymeleaf-33ddd0");
        return "index";
    }
}
