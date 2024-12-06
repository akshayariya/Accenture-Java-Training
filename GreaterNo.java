/**
 * The Tester package contains classes for testing purposes.
 */
package Tester;
import java.util.*;

/**
 * This class allows the user to input two numbers and determines the greater of the two.
 */
public class GreaterNo {

    int a;
    int b;
    Scanner sc = new Scanner(System.in);

    
    /**
     * This method compares two numbers entered by the user and prints the greatest number.
     * If the numbers are equal, it prints that they are equal.
     * If the first number is greater, it prints the first number is the greatest.
     * If the second number is greater, it prints the second number is the greatest.
     */
    public void checkGreatest(){

        System.out.println("Enter a first Number");
        this.a = sc.nextInt();
        System.out.println("Enter Second Number");
        this.b = sc.nextInt();

        if (a == b){
            System.out.println(a+" and "+b+" are equal");
        }
        else if(a > b){
            System.out.println(a+" is greatest");
        }
        else{
            System.out.println(b+" is greates");
        }
        
    }

    /**
     * The main method creates an instance of the GreaterNo class and calls the checkGreatest method.
     * This method is the entry point of the program.
     *
     * @param args The command line arguments passed to the program
     */
    public static void main(String[] args) {
        GreaterNo obj = new GreaterNo();

        obj.checkGreatest(); // call the function
        
    }

}
