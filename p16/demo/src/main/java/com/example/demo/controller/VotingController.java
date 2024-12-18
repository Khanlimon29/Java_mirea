package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VotingController {

    private int javaVotes = 0;
    private int pythonVotes = 0;
    private int cppVotes = 0;

    @PostMapping("/home")
    public String vote(@RequestParam("option") String option, Model model) {
        switch (option) {
            case "Java":
                javaVotes++;
                break;
            case "Python":
                pythonVotes++;
                break;
            case "C++":
                cppVotes++;
                break;
        }

        String voteResult = String.format("Результаты голосования: Java - %d, Python - %d, C++ - %d",
                javaVotes, pythonVotes, cppVotes);
        model.addAttribute("voteResult", voteResult);

        return "home";
    }
}
