package com.azubike.ellipsis.springsecsymmetric.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    String getHomePage(Authentication authentication){
        return String.format("Hello ,%s ",authentication.getName());
    }
}
