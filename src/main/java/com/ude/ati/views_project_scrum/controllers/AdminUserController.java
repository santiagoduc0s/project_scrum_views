package com.ude.ati.views_project_scrum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminUserController {

    @GetMapping("/administrar-usuarios")
    public String manageUsers() {
        return "admin/manage-users";
    }
}
