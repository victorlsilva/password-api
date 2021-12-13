package com.victor.exercicio.passwordapi.service;

import com.victor.exercicio.passwordapi.validator.CheckPasswordConstraints;
import org.springframework.stereotype.Service;

@Service
public class PasswordValidationService extends CheckPasswordConstraints implements PasswordValidation {

    @Override
    public Boolean allConstraintsAreValid(String password) {
        return this.notContainRepeatedChar(password)
                && this.haveUpperCaseChar(password)
                && this.haveLowerCaseChar(password)
                && this.haveNumber(password)
                && this.minNumberOfChars(password, 9)
                && this.haveSpecialChar(password)
                && this.notContainWhiteSpace(password);
    }
}
