package com.racingcar.game;

import com.racingcar.domains.Cars;
import com.racingcar.ui.InputUI;
import com.racingcar.ui.OutputUI;

public class RacingCarGame {
    int moveCycleCount;
    Cars cars;

    public void execute() {
        init();
        play();
    }

    private void play() {
        OutputUI.printExecutionResult();
        for (int i = 1; i <= moveCycleCount; i++) {
            cars.moveForward();
            cars.printDistance();
        }
        OutputUI.printWinners(cars.getMaxDistanceCarNames());
    }

    private void init() {
        try {
            makeCars(receiveCarNames());
            receiveMoveCycleCount();
        } catch (IllegalArgumentException e) {
            OutputUI.print(e.getMessage());
            init();
        }
    }

    private String receiveCarNames() {
        OutputUI.printInputCarNames();
        return InputUI.receiveCarNames();
    }

    private void receiveMoveCycleCount() {
        OutputUI.printInputMoveCycleCount();
        moveCycleCount = InputUI.receiveMoveCycleCount();
    }

    public void makeCars(String carNames) {
        cars = new Cars(carNames);
    }
}
