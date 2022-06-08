package com.tundeadetunji.multipurpose.controllers;

import com.tundeadetunji.multipurpose.models.User;
import com.tundeadetunji.multipurpose.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {
    @Autowired private UserService service;

    @GetMapping("/users")
    public String ShowUsers(Model model){
        List<User> listUsers = service.listAllUsers();
        model.addAttribute("listUsers", listUsers);

        return "Users";
    }
}













