package com.victor.exercicio.passwordapi.constraint;

public interface SpecialCharValidation {

    /***
     * Valida se existe um caractere especial
     * @param password
     * @return boolean
     */
    boolean haveSpecialChar(String password);

}
