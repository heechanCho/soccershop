package com.soccerSite.soccershop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
