package com.victor.exercicio.passwordapi.constraint;

public interface NumberOfCharsValidation {

    boolean minNumberOfChars(String password, int minSize);

    boolean maxNumberOfChars(String password, int maxSize);

}
