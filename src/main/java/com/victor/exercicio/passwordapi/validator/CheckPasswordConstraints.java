package com.victor.exercicio.passwordapi.validator;

import com.victor.exercicio.passwordapi.constraint.*;

import java.util.HashSet;

public class CheckPasswordConstraints implements RepeatedCharValidation, CharCaseValidation, NumberOfCharsValidation,
                                        SpecialCharValidation, WhiteSpaceValidation, NumberValidation {

    private static final String SPECIAL_CHARACTERS_STRING = "!@#$%^&*()-+";

    @Override
    public Boolean notContainRepeatedChar(String password) {
        HashSet<Character> characters = new HashSet<>();

        for(int i = 0; i < password.length(); i++) {
            characters.add(password.toUpperCase().charAt(i));
        }

        return (characters.size() == password.length());
    }

    @Override
    public boolean haveUpperCaseChar(String password) {
        char ch;

        for(int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch))
                return true;
        }
        return false;
    }

    @Override
    public boolean haveLowerCaseChar(String password) {
        char ch;

        for(int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isLowerCase(ch))
                return true;
        }
        return false;
    }

    @Override
    public Boolean haveNumber(String password) {
        char ch;

        for(int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch))
                return true;
        }
        return false;
    }

    @Override
    public boolean minNumberOfChars(String password, int minSize) {

        return password.length() >= minSize;

    }

    @Override
    public boolean maxNumberOfChars(String password, int maxSize) {

        return password.length() <= maxSize;

    }

    @Override
    public boolean haveSpecialChar(String password) {
        char ch;

        for(int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (SPECIAL_CHARACTERS_STRING.contains(Character.toString(ch)))
                return true;
        }
        return false;
    }

    @Override
    public boolean notContainWhiteSpace(String password) {
        char ch;

        for(int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isWhitespace(ch))
                return false;
        }
        return true;
    }


}
