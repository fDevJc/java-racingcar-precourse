public class OutputUI {
    static void printInputCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }
    static void printInputMoveCycleCount(){
        System.out.println("시도할 회수는 몇회인가요?");
    }
    static void printCarDistance(String carName,int distance){
        StringBuilder distanceMark = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            distanceMark.append("-");
        }
        System.out.println(carName+": "+distanceMark);
    }
}
