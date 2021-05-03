package com.racingcar.domains;

import com.racingcar.util.generator.RandomNumberGenerator;

public class Car {

    private final String carName;
    private int distance;

    private final int RANDOM_NUMBER_MAX_VALUE = 9;
    private final int RANDOM_NUMBER_MIN_VALUE = 0;
    private final int MOVE_FORWARD_CRITERION = 4;
    private final int MOVE_FORWARD_UNIT = 1;


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
        if(judgeMove()){
            distance += MOVE_FORWARD_UNIT;
        }
    }

    public boolean judgeMove() {
        return new RandomNumberGenerator().getRandomNumber(RANDOM_NUMBER_MIN_VALUE,RANDOM_NUMBER_MAX_VALUE) >= MOVE_FORWARD_CRITERION;
    }
}
