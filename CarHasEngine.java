package Inheritance.Has_a_rel;


class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine; // Car "has-a" Engine

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start(); // Using Engine's functionality
        System.out.println("Car is ready to drive.");
    }
}

public class CarHasEngine {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
