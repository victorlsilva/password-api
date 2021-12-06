package com.victor.exercicio.passwordapi.controller;

import com.victor.exercicio.passwordapi.service.PasswordValidationItauService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password")
public class PasswordController {

    private PasswordValidationItauService passwordValidationService;

    public PasswordController(PasswordValidationItauService passwordValidationService) {
        this.passwordValidationService = passwordValidationService;
    }

    @GetMapping("/validation")
    public boolean passwordIsValid(@PathVariable String password){
        return passwordValidationService.isValid(password);
    }

}
