package com.victor.exercicio.passwordapi.constraint.validator;

import com.victor.exercicio.passwordapi.validator.CheckPasswordConstraints;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


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
    @DisplayName("Caso encontre caractere minusculo, deve retornar true.")
    public void whenHaveLowerCaseChar_thenReturnTrue(){
        assertTrue(checkPasswordConstraints.haveLowerCaseChar(correctPassword));
    }





}
