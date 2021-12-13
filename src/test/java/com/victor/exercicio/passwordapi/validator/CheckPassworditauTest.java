package com.victor.exercicio.passwordapi.validator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckPassworditauTest {

    private CheckPasswordConstraints checkPasswordConstraints;
    private String correctPassword;

    @BeforeAll
    public void setup(){
        checkPasswordConstraints = new CheckPasswordConstraints();
        correctPassword = "AbTp9!fok";
    }

    @Test
    @DisplayName("Caso encontre caracteres repetidos deve retornar false")
    public void whenFindRepeatedChar_thenReturnFalse() {
        assertFalse(checkPasswordConstraints.notContainRepeatedChar("aA"));
        assertFalse(checkPasswordConstraints.notContainRepeatedChar("aa"));
    }

    @Test
    @DisplayName("Caso não encontre caracteres repetidos deve retornar true")
    public void whenRepeatedCharNotFound_ThenReturnTrue(){
        assertTrue(checkPasswordConstraints.notContainRepeatedChar(correctPassword));
    }

    @Test
    @DisplayName("Caso não encontre caractere maiúsculo deve retornar false")
    public void whenUpperCaseCharNotFound_ThenReturnFalse(){
        assertFalse(checkPasswordConstraints.haveUpperCaseChar("senhateste123!"));
    }

    @Test
    @DisplayName("Caso encontre caractere maiúsculo, deve retornar true.")
    public void whenHaveUpperCaseChar_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.haveUpperCaseChar(correctPassword));
    }

    @Test
    @DisplayName("Caso não encontre caractere minúsculo, deve retornar false.")
    public void whenLowerCaseCharNotFound_thenReturnFalse(){
        assertFalse(checkPasswordConstraints.haveLowerCaseChar("SENHATESTE123!"));
    }

    @Test
    @DisplayName("Caso encontre caractere minúsculo, deve retornar true.")
    public void whenHaveLowerCaseChar_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.haveLowerCaseChar(correctPassword));
    }

    @Test
    @DisplayName("Caso não encontre um digito, deve retornar false.")
    public void whenNumberNotFound_thenReturnFalse(){
        assertFalse(checkPasswordConstraints.haveNumber("senhateste!"));
    }

    @Test
    @DisplayName("Caso encontre um digito, deve retornar true.")
    public void whenHaveNumber_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.haveNumber(correctPassword));
    }

    @Test
    @DisplayName("Caso o número mínimo de caracteres definido não for atingido, deve retornar false.")
    public void whenMinNumberOfCharsNotMet_thenReturnFalse(){
        assertFalse(checkPasswordConstraints.minNumberOfChars("sen", 4));
    }

    @Test
    @DisplayName("Caso o número mínimo de caracteres definido for atingido, deve retornar true.")
    public void whenMinNumberOfCharsMet_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.minNumberOfChars(correctPassword, 4));
    }

    @Test
    @DisplayName("Caso não encontre um caractere especial, deve retornar false.")
    public void whenSpecialCharNotFound_thenReturnFalse(){
        assertFalse(checkPasswordConstraints.haveSpecialChar("sennhateste123"));
    }

    @Test
    @DisplayName("Caso encontre um caractere especial, deve retornar true.")
    public void whenHaveSpecialChar_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.haveSpecialChar(correctPassword));
    }

    @Test
    @DisplayName("Caso encontre um caractere especial, deve retornar false.")
    public void whenHaveWhiteSpace_thenReturnFalse(){
        assertFalse(checkPasswordConstraints.notContainWhiteSpace("sennha teste123"));
    }

    @Test
    @DisplayName("Caso não encontre um caractere especial, deve retornar true.")
    public void whenWhiteSpaceNotFound_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.notContainWhiteSpace(correctPassword));
    }


}
