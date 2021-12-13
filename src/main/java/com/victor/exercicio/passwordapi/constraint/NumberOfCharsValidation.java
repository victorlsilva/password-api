package com.victor.exercicio.passwordapi.constraint;

public interface NumberOfCharsValidation {

    /***
     * Valida se a quantidade de caracteres minima definida foi alterada.
     * @param password
     * @return boolean
     */
    boolean minNumberOfChars(String password, int minSize);

}
