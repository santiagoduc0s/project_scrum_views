package com.ude.ati.views_project_scrum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/registro")
    public String register(){
        return "auth/register";
    }
}
