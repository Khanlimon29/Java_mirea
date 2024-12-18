package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/register")
    public String home() {
        return "register"; // Return the name of your Thymeleaf template
    }
}
