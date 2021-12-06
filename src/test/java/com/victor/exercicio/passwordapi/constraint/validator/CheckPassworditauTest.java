package com.victor.exercicio.passwordapi.constraint.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckPassworditauTest {

    private CheckPasswordItau checkPasswordItau;

    @BeforeAll
    public void setup(){checkPasswordItau = new CheckPasswordItau();}

    @Test
    public void whenFindRepeatedChar_thenReturnFalse() {
        Assertions.assertFalse(checkPasswordItau.notContainRepeatedChar("aA"));
        Assertions.assertFalse(checkPasswordItau.notContainRepeatedChar("aa"));
        Assertions.assertFalse(checkPasswordItau.notContainRepeatedChar("ABCDa"));
        Assertions.assertFalse(checkPasswordItau.notContainRepeatedChar("aBCDa"));
    }


}
