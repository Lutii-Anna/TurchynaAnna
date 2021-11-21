package hw4.details;

import hw4.vehicles.SportCar;
import hw4.vehicles.Truck;
import hw4.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("BMW", "sedan", 1450, 185);
        System.out.println("Sportcar speed " + sportCar.speed);
        Truck truck = new Truck("MAN", "universal", 3500, 138);
        System.out.println("Truck carrying " + truck.carrying);

        sportCar.Start();
        sportCar.Stop();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.printInfo();
    }
}
