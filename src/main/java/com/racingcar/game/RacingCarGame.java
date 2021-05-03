package com.racingcar.game;

import com.racingcar.domains.Cars;
import com.racingcar.ui.InputUI;
import com.racingcar.ui.OutputUI;

public class RacingCarGame implements Game{
    int moveCycleCount;
    Cars cars;

    @Override
    public void execute(){
        init();
        play();
    }

    private void play() {
        OutputUI.printExecutionResult();
        for (int i = 1; i <= moveCycleCount; i++) {
            cars.moveForward();
            cars.printDistance();
        }
        cars.getMaxDistanceCar();
    }

    private void init() {
        try{
            makeCars(receiveCarNames());
            receiveMoveCycleCount();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
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
