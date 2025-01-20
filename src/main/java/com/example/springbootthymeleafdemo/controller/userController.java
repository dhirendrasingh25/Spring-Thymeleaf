package com.example.springbootthymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("/dashboard")
    public String showDashBoard(Model model){
        model.addAttribute("user","Sameer Singh");
        model.addAttribute("role","admin");
        return "dashboard";
    }
}
