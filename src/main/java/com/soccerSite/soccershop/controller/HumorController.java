package com.soccerSite.soccershop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HumorController {

    @GetMapping(value = "/humor")
    public String humorForm() {
        return "humor";
    }
}
