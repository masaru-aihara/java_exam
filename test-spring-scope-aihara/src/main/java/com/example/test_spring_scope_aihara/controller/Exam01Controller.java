package com.example.test_spring_scope_aihara.controller;

import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestScope("/exam01")
public class Exam01Controller {
    public String index(){
        return "exam01";
    }

    @RequestScope("/exam01result")
    public String result(String name,String password){
        
    }
}
