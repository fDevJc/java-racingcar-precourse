import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {
    @ParameterizedTest
    @ValueSource(strings = {"car1","car2","car3"})
    @DisplayName("자동차 이름을 통하여 자동차 생성")
    void makeCar(String carName) {
        RacingCarGame racingCarGame = new RacingCarGame();
        Car car = racingCarGame.makeCar(carName);
        assertThat(car.getCarName()).isEqualTo(carName);
    }

    @Test
    void makeCars() {
        RacingCarGame racingCarGame = new RacingCarGame();
        String carNames = "car1,car2,car3";
        List<Car> cars = racingCarGame.makeCars(carNames);
        for (Car car : cars){
            assertThat(car).isNotNull();
        }
    }
}
