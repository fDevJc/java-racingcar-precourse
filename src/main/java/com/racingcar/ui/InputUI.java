package com.racingcar.ui;

import java.util.Scanner;

public class InputUI {
    static Scanner scanner = new Scanner(System.in);

    public static String receiveCarNames() {
        return scanner.nextLine();
    }

    public static int receiveMoveCycleCount() {
        return Integer.parseInt(scanner.nextLine());
    }
}
