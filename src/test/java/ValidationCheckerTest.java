import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationCheckerTest {

    private ValidationChecker validationChecker;

    @BeforeEach
    void setUp() {
        validationChecker = new ValidationChecker();
    }

    @Test
    @DisplayName("입력값이 숫자인지 확인")
    void validNumber () {
        assertThat(validationChecker.validNumber("123")).isTrue();
        assertThat(validationChecker.validNumber("1q2w3e")).isFalse();
        assertThat(validationChecker.validNumber("asd")).isFalse();
    }

    @Test
    @DisplayName("입력값이 0보다 큰지 확인")
    void isGreaterThanZero() {
        assertThat(validationChecker.isGreaterThanZero(0)).isFalse();
        assertThat(validationChecker.isGreaterThanZero(1)).isTrue();
        assertThat(validationChecker.isGreaterThanZero(-1)).isFalse();
    }

    @Test
    @DisplayName("빈 문자열 확인")
    void isEmptyString() {
        assertThat(validationChecker.isEmptyString("")).isTrue();
        assertThat(validationChecker.isEmptyString(" ")).isTrue();
        assertThat(validationChecker.isEmptyString("car")).isFalse();
        assertThat(validationChecker.isEmptyString("car1,car2")).isFalse();
    }

    @Test
    void 공백제거() {
        String test = " ";
        test = test.trim();
        assertThat(validationChecker.isEmptyString(test)).isTrue();
    }
}
