package com.example.test_spring_mvc_aihara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
    @RequestMapping("")
    public String index(){
        return "name-form";
    }
    @RequestMapping("/nameform")
    public String form(String name){
        System.out.println("入力された値は" + name + "です。");
        return "finished";
    }
}
