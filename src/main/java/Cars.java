import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) {
        validateNumberOfCars(carNames);
        validateNumberOfCarNameCharacter(carNames);
        cars = new ArrayList<>();
        for(String carName: carNames.split(",")){
            Car car = new Car(carName);
            cars.add(car);
        }
    }

    private void validateNumberOfCars(String carNames) {
        ValidationChecker validationChecker = new ValidationChecker();
        if (validationChecker.isEmptyString(carNames)) {
            throw new IllegalArgumentException("1개 이상의 자동차 이름을 입력해주세요");
        }
    }

    private void validateNumberOfCarNameCharacter(String carNames) {
        ValidationChecker validationChecker = new ValidationChecker();
        if (validationChecker.isEmptyString(carNames)) {
            throw new IllegalArgumentException("1개 이상의 자동차 이름을 입력해주세요");
        }
    }

    public void moveForward(){
        for(Car car : cars){
            car.moveForward();
        }
    }

    public void printDistance(){
        for (Car car : cars ) {
            OutputUI.printCarDistance(car.getCarName(),car.getDistance());
        }
        System.out.println();
    }

    public void getMaxDistanceCar(){
        //TODO: stream을 사용해서 뽑아보자
        for (Car car : cars) {
            System.out.println(car.getDistance());
        }
    }
}
