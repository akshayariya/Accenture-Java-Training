package Inheritance.Is_a_rel;


class Vehicle {
    // vehicle instance variable
    String brand;
    String color;
    int wheels;

    public Vehicle(String brand, String color, int wheels) {
        this.brand = brand;
        this.color = color;
        this.wheels = wheels;
    }

    public void displayVehicleInfo() {
        System.out.println("Brand:" + brand);
        System.out.println("Color:" + color);
        System.out.println("Wheels:" + wheels);
        System.out.println("--------------------------");

    }
}

class Car extends Vehicle {
    // car istance variable
    int maxSpeed;

    public Car(String brand, String color, int wheels, int maxSpeed) {
        super(brand, color, wheels);
        this.maxSpeed = maxSpeed;
    }

    public void displayCarInfo() {
        System.out.println("Brand:" + brand);
        System.out.println("Color:" + color);
        System.out.println("Wheels:" + wheels);
        System.out.println("Max Speed:" + maxSpeed);
        System.out.println("--------------------------");

    }
}

class XUV extends Car {
    // XUV instance variable
    String model;

    public XUV(String brand, String color, int wheels, int maxSpeed, String model) {
        super(brand, color, wheels, maxSpeed);
        this.model = model;
    }

    public void displayXUVInfo(){
        System.out.println("Brand:" + brand);
        System.out.println("Color:" + color);
        System.out.println("Wheels:" + wheels);
        System.out.println("Max Speed:" + maxSpeed);
        System.out.println("Model:"+model);
        System.out.println("--------------------------");
    }
}

public class MultiLevelInheit {
    public static void main(String[] args) {
        XUV firstXuv = new XUV("Mahindra","White",4, 120, "XUV 700");
        firstXuv.displayVehicleInfo();
        firstXuv.displayCarInfo();
        firstXuv.maxSpeed=180;
        firstXuv.displayXUVInfo();

    }
}
