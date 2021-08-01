package com.ude.ati.views_project_scrum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping("/proyectos")
    public String index(){
        return "project/index";
    }
}
