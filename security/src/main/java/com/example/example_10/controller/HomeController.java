package com.example.example_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"", "/", "/home"}) // Map multiple paths to the same method
    public String home() {

        return "home.html"; // This will render the home.html template
    }
}
