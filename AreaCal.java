/**
 * This package contains classes and interfaces that demonstrate polymorphism in Java.
 */
package Polymorhism;

/**
 * This class represents Area1 and contains a method to calculate the area of a rectangle and square.
 */
class Area1 {

    int write;
    
    /**
     * Calculates the area of a square given the length of its side.
     *
     * @param a The length of the side of the square
     * @return The area of the square
     */
    int areacal(int a) {
        return a * a;
    }

    /**
     * Calculates the area of a rectangle given its length and width.
     *
     * @param a The length of the rectangle
     * @param b The width of the rectangle
     * @return The area of the rectangle
     */
    double areacal(double a, double b) {
        return a * b;
    }
}

/**
 * This class demonstrates the calculation of the area of different shapes.
 * It calculates the area of a square when provided with one side length,
 * and the area of a rectangle when provided with length and width.
 */
public class AreaCal {
    public static void main(String[] args) {
        Area1 calc = new Area1();
        System.out.println(calc.areacal(5));       // Calls int version
        System.out.println(calc.areacal(3.5, 2.5));   // Calls double version
    }
}

