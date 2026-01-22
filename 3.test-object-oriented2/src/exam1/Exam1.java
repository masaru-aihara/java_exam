package exam1;

public class Exam1 {
    public static void main(String[] args) {
        Car[] car  = {new SurperCar("フェラーリ"), new EcoCar("プリウス")};
        for(Car c : car){
            c.putOnGas();
        }
    }
}
