//Створити класс Car в пакеті vehicles. +
//        Створити Engine в details +
//        Створити Driver в professions +
//        Driver містить:
//        поле name  +
//        поле experience +
//        Engine містить:
//        поле power +
//        поле company +
//        Car містить:
//        поле brand +
//        поле type +
//        поле weight  +
//        поле driver типу Driver
//        поле engine типу Engine
//        метод start() - друкує “Let’s drive”
//        метод stop()  - друкує “Stop”
//        метод turnRight() -  друкує “Turn right”
//        метод turnLeft() -  друкує “Turn left”
//        метод printInfo() - друкує інформацію про авто, шофера та двигун
//        Створити клас від Car - SportCar, який має поле speed
//        Створити клас від Car - Truck, який має поле carrying
//        Створити клас Person від якого буде наслідувати класс Driver
//        Створити гетери, сетери, конструктори, перевизначити класс toString
//        Створити об'єкти типу SportCar та Truck -  та вивести їх

package hw4.vehicles;

import hw4.details.Engine;
import hw4.professions.Driver;

public class Car {
    String brand;
    String type;
    int weight;

    Car(String b, String t, int w) {
        brand = b;
        type = t;
        weight = w;
    }

    public Car() {
    }

    public void Start() {
        System.out.println("Let’s drive");
    }


    public void Stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    public void printInfo () {
        //System.out.println(car.);
        System.out.println("друкує інформацію про авто, шофера та двигун");
    }
}
