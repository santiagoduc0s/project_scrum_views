package com.ude.ati.views_project_scrum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

//    public String editProfile(){
//
//        return "modificarUsuario";
//    }
    @GetMapping("/registro")
    public String register(){
        return "user/register";
    }

}
