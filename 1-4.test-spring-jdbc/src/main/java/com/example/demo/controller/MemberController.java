package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {

		repository.findAll().forEach(System.out::println);

		Member member = new Member();
		member = repository.load(2);
		System.out.println(member);

		Member member2 = new Member();
		member2.setName("相原");
		member2.setAge(24);
		member2.setDepId(1);
		repository.save(member2);

		member.setName("シロー");
		repository.save(member);
		
		return "member";
	}
}
