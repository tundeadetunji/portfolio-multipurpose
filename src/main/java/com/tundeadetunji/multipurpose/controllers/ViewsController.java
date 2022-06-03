package com.tundeadetunji.multipurpose.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewsController {

    @GetMapping("/")
    public String index(Model model) {
        return "hello";
    }
}
