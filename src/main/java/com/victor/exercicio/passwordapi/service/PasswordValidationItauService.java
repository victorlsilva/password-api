package com.victor.exercicio.passwordapi.service;

import com.victor.exercicio.passwordapi.constraint.PasswordValidation;
import com.victor.exercicio.passwordapi.constraint.validator.CheckPasswordItau;
import org.springframework.stereotype.Service;

@Service
public class PasswordValidationItauService extends CheckPasswordItau implements PasswordValidation {



    @Override
    public Boolean isValid(String password) {
        boolean isValid = this.notContainRepeatedChar(password)
                        && this.haveUpperCaseChar(password)
                        && this.haveLowerCaseChar(password)
                        && this.haveNumber(password)
                        && this.minNumberOfChars(password, 9)
                        && this.haveSpecialChar(password)
                        && this.notContainWhiteSpace(password);

        return isValid;

    }


}
