package com.example.springbootthymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String showHelloWorldPage(Model model) {
        model.addAttribute("message", "Hello World from Spring Boot!");
        return "hello";
    }
}
