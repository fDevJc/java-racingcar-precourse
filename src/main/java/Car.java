public class Car {

    private final String carName;
    private int distance;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    public int getDistance() {
        return this.distance;
    }

    public void moveForward() {
        if(judgeMove()){
            distance += 1;
        }
    }

    public boolean judgeMove() {
        return new RandomNumberGenerator().getRandomNumber(0,9) >= 4;
    }
}
