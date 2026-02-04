package com.example.test_spring_mvc_aihara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @RequestMapping("")
     public String showCompanyIntroduction() {
        return "redirect/show-company-introduction";
    }
    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction2() {
        return "exam-02";
    }
}
