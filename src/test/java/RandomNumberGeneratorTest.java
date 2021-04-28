import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberGeneratorTest {
    @Test
    @DisplayName("0-9까지의 랜덤넘버 생성")
    void getRandomNumber() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int i = 0; i < 100; i++) {
            assertThat(randomNumberGenerator.getRandomNumber(0,9)).isBetween(0,9);
        }
    }
}
