package com.soccerSite.soccershop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {


    @GetMapping(value = "/admin/adminPage")
    public String adminController() {
        return "admin/adminPage";
    }

}
