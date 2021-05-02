import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("yang");
    }

    @Test
    @DisplayName("자동차의 이름을 가져온다")
    void getCarName() {
        String carName = car.getCarName();
        assertThat(carName).isEqualTo("yang");
    }

    @Test
    @DisplayName("자동차의 이동거리를 가져온다")
    void getCarDistance() {
        assertThat(car.getDistance()).isEqualTo(0);
        car.moveForward();
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void judgeMove() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randomNumber = randomNumberGenerator.getRandomNumber(0,9);
        boolean isMove = car.judgeMove();
        System.out.println(randomNumber);
        if (randomNumber > 4){
            assertThat(isMove).isTrue();
        }else{
            assertThat(isMove).isFalse();
        }

    }
}
