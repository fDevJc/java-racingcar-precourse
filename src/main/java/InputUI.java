import java.util.Scanner;

public class InputUI {
    static String receiveCarNames(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int receiveMoveCycleCount(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
