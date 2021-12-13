package com.victor.exercicio.passwordapi.service;

public interface PasswordValidation {

    /***
     * Método para validar se todas as regras para a senha são atendidas
     * @param password
     * @return boolean
     */
    Boolean allConstraintsAreValid(String password);

}
