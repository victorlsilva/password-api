package com.victor.exercicio.passwordapi.controller;

import com.victor.exercicio.passwordapi.service.PasswordValidation;
import com.victor.exercicio.passwordapi.service.PasswordValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/password")
public class PasswordController {

    private final PasswordValidation passwordValidation;

    @PostMapping(path = "/validation", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity<Boolean> passwordIsValid(@RequestParam String password){
            return new ResponseEntity<>(passwordValidation.isValid(password), HttpStatus.OK);
        }

}
