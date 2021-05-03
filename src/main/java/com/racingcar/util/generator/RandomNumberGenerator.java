package com.racingcar.util.generator;

import java.util.Random;

public class RandomNumberGenerator {
    public int getRandomNumber(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue) + minValue;
    }
}
