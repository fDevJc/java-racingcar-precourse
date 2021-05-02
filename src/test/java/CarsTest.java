import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
       cars  = new Cars("car1,car2,car3");
    }

    @Test
    void 생성자_에러_테스트() {
        assertThrows(IllegalArgumentException.class,()->{
           Cars exceptionCars = new Cars("");
        });
    }

    @Test
    void getMaxDistanceCar() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");

        for (int i = 0; i < 5; i++) {
            car1.moveForward();
            car2.moveForward();
            car3.moveForward();
        }

        List<Car> carList = Arrays.asList(car1,car2,car3);

        Car car = carList.stream().max(Comparator.comparingInt(Car::getDistance)).orElseThrow(NoSuchElementException::new);

        System.out.println(car1.getDistance());
        System.out.println(car2.getDistance());
        System.out.println(car3.getDistance());

        System.out.println(car.getCarName());

    }
}
