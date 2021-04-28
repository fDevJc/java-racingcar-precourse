public class Car {

    private final String carName;
    private int distance;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistance() {
        return distance;
    }

    public void moveForward() {
        distance += 1;
    }
}
