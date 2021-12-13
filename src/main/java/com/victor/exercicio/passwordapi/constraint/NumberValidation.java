package com.victor.exercicio.passwordapi.constraint;

public interface NumberValidation {

    /***
     * Valida se existe um caractere numérico
     * @param password
     * @return boolean
     */
    boolean haveNumber(String password);

}
