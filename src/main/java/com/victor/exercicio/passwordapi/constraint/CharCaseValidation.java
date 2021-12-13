package com.victor.exercicio.passwordapi.constraint;

public interface CharCaseValidation {

    /***
     * Valida se existe caracteres maiúsculos
     * @param password
     * @return boolean
     */
    boolean haveUpperCaseChar(String password);

    /***
     * Valida se existe caracteres minúsculos
     * @param password
     * @return boolean
     */
    boolean haveLowerCaseChar(String password);

}
