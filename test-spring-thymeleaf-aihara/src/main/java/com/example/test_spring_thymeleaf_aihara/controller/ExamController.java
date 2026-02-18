package com.example.test_spring_thymeleaf_aihara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_aihara.domain.Member;
import com.example.test_spring_thymeleaf_aihara.form.MemberForm;

@Controller
@RequestMapping("/exam")
public class ExamController {
    @ModelAttribute
    public MemberForm memberForm() {
        return new MemberForm();
    }

    @RequestMapping("")
    public String index() {
        return "ex-tymeleaf-input";
    }

    @RequestMapping("result")
    public String result(Model model, MemberForm memberForm) {
        Member member = new Member();
        member.setName(memberForm.getName());
        member.setAge(memberForm.getAge());
        member.setHobbyList(memberForm.getHobbyList());
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
