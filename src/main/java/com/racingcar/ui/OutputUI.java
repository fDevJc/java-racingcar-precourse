package com.racingcar.ui;

public class OutputUI {
    public static void printExecutionResult() {
        System.out.println("실행결과");
    }
    public static void printInputCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }
    public static void printInputMoveCycleCount(){
        System.out.println("시도할 회수는 몇회인가요?");
    }
    public static void printCarDistance(String carName,int distance){
        StringBuilder distanceMark = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            distanceMark.append("-");
        }
        System.out.printf("%s : %s%n", carName, distanceMark);
    }
}
