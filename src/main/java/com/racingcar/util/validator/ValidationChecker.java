package com.racingcar.util.validator;

public class ValidationChecker {
    public Boolean validateNumber(String number) {
        return number.matches("^[0-9]+$");
    }

    public boolean isGreaterThanZero(int number) {
        return number > 0;
    }

    public boolean isEmptyString(String string) {
        return string.trim().isEmpty();
    }
}
