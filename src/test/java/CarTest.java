import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("차의 이름을 가져온다")
    void getCarName() {
        Car car = new Car("yang");
        String carName = car.getCarName();
        assertThat(carName).isEqualTo("yang");
    }
}
