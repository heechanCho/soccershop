package com.soccerSite.soccershop.controller;

import com.soccerSite.soccershop.dto.MemberFormDto;
import com.soccerSite.soccershop.entity.Member;
import com.soccerSite.soccershop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MemberService memberService;

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }

//    @GetMapping("/posts/save")
//    public String postsSave() {
//        return "posts-save";
//    }

    @GetMapping(value = "/posts/save")
    public String getName(Model model, Principal principal) {
        MemberFormDto memberFormDto = new MemberFormDto();
        Member member = memberService.findMemberByEmail(principal.getName());

        memberFormDto.setName(member.getName());

        model.addAttribute("memberFormDto", memberFormDto);

        System.out.println("=====================>" + memberFormDto);
        return "/posts-save";
    }
}
