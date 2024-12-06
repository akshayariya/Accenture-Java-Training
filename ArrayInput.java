package arrayPack;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Define the size of the array
        try (Scanner sc = new Scanner(System.in)) {
            // Define the size of the array
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            
            // Create an array with the user-defined size
            int[] numbers = new int[size];
            
            // Take input from the user for each element
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();  // Assign user input to the array
            }
            
            // Display the array elements
            System.out.println("Array elements are:");
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
}
