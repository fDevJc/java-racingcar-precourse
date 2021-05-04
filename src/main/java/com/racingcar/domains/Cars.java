package com.racingcar.domains;

import com.racingcar.ui.OutputUI;
import com.racingcar.util.validator.ValidationChecker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) throws IllegalArgumentException {
        cars = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            validateEmptyCarName(carName);
            validateNumberOfCarNameCharacter(carName);
            Car car = new Car(carName);
            cars.add(car);
        }
    }

    public void validateEmptyCarName(String carName) {
        if (ValidationChecker.isEmptyString(carName)) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요");
        }
    }

    public void validateNumberOfCarNameCharacter(String carName) {
        if (ValidationChecker.isGreaterThanInput(carName,RuleBook.MAX_LENGTH_OF_CAR_NAME.getValue())) {
            throw new IllegalArgumentException("5자 이하의 자동차 이름을 입력해주세요");
        }
    }

    public void moveForward() {
        for (Car car : cars) {
            car.moveForward();
        }
    }

    public void printDistance() {
        for (Car car : cars ) {
            OutputUI.printCarDistance(car.getCarName(), car.getDistance());
        }
        System.out.println();
    }

    public int getMaxDistance() {
        return cars.stream()
                .max(Comparator.comparingInt(Car::getDistance))
                .get()
                .getDistance();
    }

    public String getMaxDistanceCarNames() {
        return cars.stream()
                .filter(car -> car.getDistance() == getMaxDistance())
                .map(Car::getCarName)
                .reduce((prev,next) -> prev + "," + next)
                .get();
    }
}
