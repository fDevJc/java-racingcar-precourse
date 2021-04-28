import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {

    //TODO: 차의 인스턴스를 생성하는 코드가 여기 있는게 맞을까?
    public Car makeCar(String carName) {
        return new Car(carName);
    }

    public String receiveCarNames(){
        //TODO: 출력관련하여 리팩토링
        System.out.println("경주할 자동차 이름을 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public List<Car> makeCars(String carNames) {
        List<Car> cars= new ArrayList<>();
        for (String carName : carNames.split(",")){
            cars.add(makeCar(carName));
        }
        return cars;
    }
}
