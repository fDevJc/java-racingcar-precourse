package com.racingcar.domains;

public enum RuleBook {
    RANDOM_NUMBER_MAX_VALUE(9),
    RANDOM_NUMBER_MIN_VALUE(0),
    MOVE_FORWARD_CRITERION(4),
    MOVE_FORWARD_UNIT(1),
    MAX_LENGTH_OF_CAR_NAME(5);

    private int value;
    RuleBook(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
