//Створити клас від Car - SportCar, який має поле speed

package hw4.vehicles;

public class SportCar extends Car {
    public int speed;

    public SportCar() {
    }

    public SportCar(String b, String t, int w, int s) {
        this.brand = b;
        this.type = t;
        this.weight = w;
        this.speed = s;
    }

    public SportCar(int speed) {
        this.speed = speed;
    }
}
