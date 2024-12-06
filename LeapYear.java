/**
 * The Tester package contains classes for testing purposes.
 */
package Tester;

import java.util.*;

/**
 * The LeapYear class contains a method to check if a given year is a leap year or not.
 */
public class LeapYear {

    /**
     * Checks if a given year is a leap year or not.
     *
     * @param year The year to be checked for leap year
     */
    public void checkLeapYear(int year){
        if (year%400 == 0){
             System.out.println("Leap year");;
        }
        else if((year%4 == 0) && (year%100 !=0)){
            System.out.println("Leap Year");;
        }
        else{
            System.out.println("Not a Leap year");;
        }

    }

    /**
     * This program checks if a given year is a leap year or not.
     * It prompts the user to enter a year and then calls the checkLeapYear method
     * to determine if the year is a leap year.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYear lp = new LeapYear();

        System.out.println("Enter the year to check leap year:");
        int year = sc.nextInt();
        
        lp.checkLeapYear(year);  // call the  fuction
        sc.close();   // close the scanner object
    }
}
