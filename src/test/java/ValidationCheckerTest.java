import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ValidationCheckerTest {

    @Test
    @DisplayName("입력값이 숫자인지 확인")
    void validNumber () {
        ValidationChecker validationChecker = new ValidationChecker();
        assertThat(validationChecker.validNumber("123")).isTrue();
        assertThat(validationChecker.validNumber("1q2w3e")).isFalse();
        assertThat(validationChecker.validNumber("asd")).isFalse();
    }

    @Test
    @DisplayName("입력값이 0보다 큰지 확인")
    void isGreaterThanZero() {
        ValidationChecker validationChecker = new ValidationChecker();
        assertThat(validationChecker.isGreaterThanZero(0)).isFalse();
        assertThat(validationChecker.isGreaterThanZero(1)).isTrue();
        assertThat(validationChecker.isGreaterThanZero(-1)).isFalse();
    }
}
