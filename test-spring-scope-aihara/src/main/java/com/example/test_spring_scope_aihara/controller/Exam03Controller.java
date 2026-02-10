package com.example.test_spring_scope_aihara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_aihara.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam03";
    }

    @RequestMapping("exam03result")
    public String result(String name, String email, String password, Integer age, Model model) {
        User user = new User();
        if ("yamada@sample.com".equals(email) && "yamayama".equals(password)) {
            user.setEmail(email);
            user.setName("山田太郎");
            user.setAge(18);
            session.setAttribute("user", user);
            
            model.addAttribute("resultmessage", "ログインに成功しました");
            return "exam03-result";
        } else {
            model.addAttribute("errormessage", "ログインに失敗しました");
            return "exam03";

        }

    }
}
