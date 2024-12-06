package Abstraction;

interface Shape {

    // public static void test(){
    //     System.out.println("test static method");
    // }

    //can create abstract method without abstract keyword
    // not allowed to create construtor of interface

    // automatic static and final variable
    int num = 10;

    public void draw(); // Abstract method
    public double calculateArea(double dimension); // Abstract method
}

// interface cannot implememnt interface
interface Shape22 {

    public void draw();

}


class Circle implements Shape,Shape22 {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }

    public double calculateArea(double side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea(5));

        Shape square = new Square();
        square.draw();
        System.out.println("Square Area: " + square.calculateArea(4));
        
    }
}

