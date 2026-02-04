package com.example.test_spring_mvc_aihara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {
    @RequestMapping("/show-self-introdution")
    public String showSelfIntroductioString() {
        return "exam-01";
    }
}
