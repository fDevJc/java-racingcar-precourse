package com.racingcar.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;

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
    void getMaxDistance() {
        class Car {
            String name;
            int distance;

            Car (String name, int distnace) {
                this.name = name;
                this.distance = distnace;
            }
            int getDistance() {
               return this.distance;
            }
        }

        Car car1 = new Car("car1",4);
        Car car2 = new Car("car2",3);
        Car car3 = new Car("car3",4);

        List<Car> carList = Arrays.asList(car1,car2,car3);

        int maxDistance = carList.stream().max(Comparator.comparingInt(Car::getDistance)).get().getDistance();

        assertThat(maxDistance).isEqualTo(4);

    }
}
