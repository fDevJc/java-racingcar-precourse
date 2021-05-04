package com.racingcar.util.generator;

import com.racingcar.domains.RuleBook;

import java.util.Random;

public class RandomNumberGenerator {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(RuleBook.RANDOM_NUMBER_MAX_VALUE.getValue()) + RuleBook.RANDOM_NUMBER_MIN_VALUE.getValue();
    }
}
