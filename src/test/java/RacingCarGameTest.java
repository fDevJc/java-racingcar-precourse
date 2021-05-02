import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {
    @Test
    @DisplayName("자동차 생성")
    void makeCars() {
        RacingCarGame racingCarGame = new RacingCarGame();
        String carNames = "car1,car2,car3";
        racingCarGame.makeCars(carNames);
        assertThat(racingCarGame.cars).isNotNull();
    }
}
