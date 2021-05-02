public class RacingCarGame {
    int moveCycleCount;
    Cars cars;

    public void execute(){
        init();
        play();
    }
    private void play() {
        System.out.println("실행결과");
        for (int i = 1; i <= moveCycleCount; i++) {
            cars.moveForward();
            cars.printDistance();
        }
        cars.getMaxDistanceCar();
    }
    private void init() {
        makeCars(receiveCarNames());
        receiveMoveCycleCount();
    }

    public String receiveCarNames() {
        OutputUI.printInputCarNames();
        return InputUI.receiveCarNames();
    }

    public void receiveMoveCycleCount(){
        OutputUI.printInputMoveCycleCount();
        moveCycleCount = InputUI.receiveMoveCycleCount();
    }

    public void makeCars(String carNames) {
        cars = new Cars(carNames);
    }
}
