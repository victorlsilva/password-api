package com.victor.exercicio.passwordapi.constraint;

public interface WhiteSpaceValidation {

    /***
     * Valida se existe algum caractere em branco
     * @param password
     * @return boolean
     */
    boolean notContainWhiteSpace(String password);

}
