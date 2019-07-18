package com.study.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cros")

public class CrosController {

    @GetMapping("/crostest")
    @CrossOrigin()
    public String crosTest(){
        return "";
    }
}
