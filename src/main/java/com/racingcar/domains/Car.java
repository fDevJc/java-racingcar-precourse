package com.racingcar.domains;

import com.racingcar.util.generator.RandomNumberGenerator;

public class Car {

    private final String carName;
    private int distance;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    public int getDistance() {
        return this.distance;
    }

    public void moveForward() {
        if(judgeMoveByRandomNumber(RandomNumberGenerator.getRandomNumber())){
            distance += RuleBook.MOVE_FORWARD_UNIT.getValue();
        }
    }

    public boolean judgeMoveByRandomNumber(int randomNumber) {
        return  randomNumber >= RuleBook.MOVE_FORWARD_CRITERION.getValue();
    }
}
