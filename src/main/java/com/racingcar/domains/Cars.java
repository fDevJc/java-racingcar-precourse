package com.racingcar.domains;

import com.racingcar.ui.OutputUI;
import com.racingcar.util.validator.ValidationChecker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) throws IllegalArgumentException{
        validateNumberOfCars(carNames);
        validateNumberOfCarNameCharacter(carNames);
        cars = new ArrayList<>();
        for(String carName: carNames.split(",")){
            Car car = new Car(carName);
            cars.add(car);
        }
    }

    private void validateNumberOfCars(String carNames) {
        ValidationChecker validationChecker = new ValidationChecker();
        if (validationChecker.isEmptyString(carNames)) {
            throw new IllegalArgumentException("1개 이상의 자동차 이름을 입력해주세요");
        }
    }

    private void validateNumberOfCarNameCharacter(String carNames) {
        ValidationChecker validationChecker = new ValidationChecker();
        if (validationChecker.isEmptyString(carNames)) {
            throw new IllegalArgumentException("1개 이상의 자동차 이름을 입력해주세요");
        }
    }

    public void moveForward() {
        for (Car car : cars){
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

    public String getMaxDistanceCar() {
        return cars.stream()
                .filter(car -> car.getDistance() == getMaxDistance())
                .map(Car::getCarName)
                .reduce((prev,next) -> prev + "," + next)
                .get();
    }
}
