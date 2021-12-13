package com.victor.exercicio.passwordapi.constraint;

public interface RepeatedCharValidation {

    /***
     * Valida se existe existe um caractere repetido
     * @param password
     * @return boolean
     */
    boolean notContainRepeatedChar(String password);

}
