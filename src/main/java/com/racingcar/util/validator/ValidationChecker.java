package com.racingcar.util.validator;

public class ValidationChecker {
    public static boolean isGreaterThanInput(String checkTarget,int input) {
        return checkTarget.length() > input;
    }

    public static boolean isEmptyString(String string) {
        return string.trim().isEmpty();
    }
}
