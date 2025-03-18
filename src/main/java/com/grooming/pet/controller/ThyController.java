package com.grooming.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThyController {

    @GetMapping("/thy")
    public String example(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "thy";
    }
}