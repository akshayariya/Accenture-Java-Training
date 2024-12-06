package Inheritance.Is_a_rel;


class Vehicle {
    String brand;
    int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
        System.out.println("---------------------");
    }
}

class Car extends Vehicle {
    String maxSpeed;

    public Car(String brand, int wheels, String maxSpeed) {
        super(brand, wheels);
        this.maxSpeed = maxSpeed;
    }
    public void displayCarInfo(){
        System.out.println("Brand of Car: " + brand);
        System.out.println("Number of Wheels in Car: " + wheels);
        System.out.println("Max Speed of Car: "+maxSpeed);
        System.out.println("---------------------");
    }
    
}

class Bike extends Vehicle {
    String maxSpeedOfBike;

    public Bike(String brand, int wheels, String maxSpeedOfBike) {
        super(brand, wheels);
        this.maxSpeedOfBike = maxSpeedOfBike;
    }
    public void displayBikeInfo(){
        System.out.println("Brand of Bike: " + brand);
        System.out.println("Number of Wheels in Bike: " + wheels);
        System.out.println("Max Speed of Bike: "+maxSpeedOfBike);
        System.out.println("---------------------");
    }
    
}


// main class
public class HierarchialInheirt {
    public static void main(String[] args) {

        Vehicle c1 = new Car("MS",4,"220 KPH");

        // Vehicle c2 = new Car("Tata",4,"240 KPH"); //It wil not allowed to access Car constructor
        // Vehicle b1 = new Bike("Hero",2,"180 KPH"); // It wil not allowed to access Bike constructor

        Bike bike1 = new Bike("Honda",2,"150 KPH");
        Car car1 = new Car("Mahindra",4,"280 KPH");

        c1.displayVehicleInfo(); //correct
        // c1.displayCarInfo();  //method displayCarInfo() is undefined for the type Vehicle
        // b1.displayBikeInfo();  //method displayBikeInfo() is undefined for the type Vehicle

        bike1.displayBikeInfo();
        car1.displayCarInfo();
    }
}
