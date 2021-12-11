package com.victor.exercicio.passwordapi.controller;

import com.victor.exercicio.passwordapi.service.PasswordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    private PasswordService passwordService;

    public PasswordController(PasswordService passwordValidationService) {
        this.passwordService = passwordValidationService;
    }

    @PostMapping(path = "/validation", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Boolean> passwordIsValid(@RequestParam String password){
            return new ResponseEntity<>(passwordService.isValid(password), HttpStatus.OK);
        }

}
