package Day_12.Home_task;

public class carTest {
    public static void main(String[] args) {

        SportsCar car = new SportsCar();

        car.start();
        car.turbo();
    }
}
class Car {

    void start() {
        System.out.println("Car Started");
    }
}

class SportsCar extends Car {

    void turbo() {
        System.out.println("Turbo Enabled");
    }
}
