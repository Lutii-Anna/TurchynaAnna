//        Створити клас від Car - Truck, який має поле carrying

package hw4.vehicles;

public class Truck extends Car {
    public int carrying;


    public Truck (String b, String t, int w, int c) {
        this.brand = b;
        this.type = t;
        this.weight = w;
        this.carrying = c;
    }

    public Truck(int speed) {
        this.carrying = carrying;
    }
}
//
//    public int getCarrying() {
//        return carrying;
//    }
//
//    public void setCarrying(int carrying) {
//        this.carrying = carrying;
//    }
//
//    public Truck(int carrying) {
//        this.carrying = carrying;
//        System.out.println("carrying Truck " + carrying);
//    }
//}
