package Inheritance.Is_a_rel;


class Vehicle {
    String brand;
    String color;
    int wheels;

    public Vehicle(String brand,String color,int wheels){
        this.brand = brand;
        this.color = color;
        this.wheels = wheels;
    }

    public void displayInfo(){
        System.out.println("Brand " + brand);
        System.out.println("Color "+color);
        System.out.println("Wheels " + wheels);
    }

}

class Car extends Vehicle{
    int airbags;

    public Car(String brand,String color,int wheels,int airbags){
        super(brand,color,wheels);
        this.airbags = airbags;
    }

    public void displayCarInfo(){
        displayInfo();
        System.out.println("Number of Airbags" + airbags);
    }

}

public class SingleLevelInherit{
    public static void main(String args[]){
        Car firstCar = new Car("Toyota","Red",4,4);
        firstCar.displayCarInfo();  //child class function
        Car secondCar = new Car("Mahindra","Black",4,6);
        secondCar.displayInfo();  //parent class funciton

    }
}
