package com.soccerSite.soccershop.controller;

import com.soccerSite.soccershop.dto.BoardDto;
import com.soccerSite.soccershop.dto.MemberFormDto;
import com.soccerSite.soccershop.entity.Board;
import com.soccerSite.soccershop.entity.Member;
import com.soccerSite.soccershop.repository.BoardRepository;
import com.soccerSite.soccershop.service.BoardService;
import com.soccerSite.soccershop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Board> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

//    public String contentForm(Model model) {
//        model.addAttribute("BoardDto", new BoardDto());
//        return
//    }

//    @PostMapping(value = "/posts/save")
//    public String boardForm(BoardDto boardDto) {
//
//        Board board = Board.createBoard(boardDto);
//        boardService.saveBoard(board);
//
//        return "redirect:/";
//    }


//    @GetMapping(value = "/memberInfo")
//    public String memberInfo(Model model, Principal principal) {
//        MemberFormDto memberFormDto = new MemberFormDto();
//
//        Member member = memberService.findMemberByEmail(principal.getName());
//
//
//        memberFormDto.setName(member.getName());
//        memberFormDto.setEmail(member.getEmail());
//        memberFormDto.setCompanyName(member.getCompanyName());
//        memberFormDto.setCompanyGroup(member.getCompanyGroup());
//
//        System.out.println(member.getName());
//        System.out.println(member.getCompanyGroup());
//        System.out.println(member.getCompanyName());
//
//
//
//        model.addAttribute("memberFormDto", memberFormDto);
//        return "/member/memberInfoForm";
//    }

}
