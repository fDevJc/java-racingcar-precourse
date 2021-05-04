package com.racingcar.util.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationCheckerTest {

    @Test
    @DisplayName("입력된 숫자가 입력된 숫자 이하인지")
    void isSmallerThanInput() {
        assertThat(ValidationChecker.isGreaterThanInput("123456",5)).isTrue();
        assertThat(ValidationChecker.isGreaterThanInput("1234",5)).isFalse();
    }

    @Test
    @DisplayName("빈 문자열 확인")
    void isEmptyString() {
        assertThat(ValidationChecker.isEmptyString("")).isTrue();
        assertThat(ValidationChecker.isEmptyString(" ")).isTrue();
        assertThat(ValidationChecker.isEmptyString("car")).isFalse();
        assertThat(ValidationChecker.isEmptyString("car1,car2")).isFalse();
    }

    @Test
    void 공백제거() {
        String test = " ";
        test = test.trim();
        assertThat(ValidationChecker.isEmptyString(test)).isTrue();
    }
}
