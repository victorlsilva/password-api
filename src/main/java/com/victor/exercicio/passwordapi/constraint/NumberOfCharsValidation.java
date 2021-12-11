package com.victor.exercicio.passwordapi.constraint;

interface NumberOfCharsValidation {

    boolean minNumberOfChars(String password, int minSize);

    boolean maxNumberOfChars(String password, int maxSize);

}
