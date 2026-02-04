package com.example.test_spring_mvc_aihara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_aihara.form.ReceiveNameForm;
@Controller
public class ReceiveNameClass {
@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
    @ModelAttribute
    public ReceiveNameForm setUpForm(){
        return new ReceiveNameForm();
    }
    @RequestMapping("")
    public String index(){
        return "name-form";
    }
    @RequestMapping("/nameform2")
    public String form(
        ReceiveNameForm form
    ){
        System.out.println("入力された値は" + form.getName() + "です。");
        return "finished";
    }
}
}
