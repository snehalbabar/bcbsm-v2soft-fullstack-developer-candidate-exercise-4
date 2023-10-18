package com.example.WebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class ApplicationController {

    @GetMapping("/login")
    public String login()
    {
        return"authenticated successfully";
    }

    @GetMapping("/user")
    public String getUser()
    {
        return"user data ";
    }
}
