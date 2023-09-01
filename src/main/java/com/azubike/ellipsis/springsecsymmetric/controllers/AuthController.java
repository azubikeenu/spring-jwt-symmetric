package com.azubike.ellipsis.springsecsymmetric.controllers;

import com.azubike.ellipsis.springsecsymmetric.service.TokenService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final TokenService tokenService;

    public AuthController(final TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    String authenticate(Authentication authentication){
        return  tokenService.generateToken(authentication);
    }
}
