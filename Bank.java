package bankSystem;

import java.util.*; // Import necessary Java packages

/**
 * The Bank class represents a simple banking system that allows users
 * to perform deposit and withdrawal operations on their account balance.
 * It includes methods to manage account transactions and displays the current
 * balance.
 */
public class Bank {
    double amount; // Instance variable to hold the account balance
    public static Scanner sc = new Scanner(System.in); // Scanner object for user input

    /**
     * Constructs a Bank object and initializes the account balance.
     * 
     * @param amount the initial account balance
     */
    Bank(double amount) {
        this.amount = amount; // Initialize account balance
    }

    /**
     * Withdraws a specified amount from the account if the balance is sufficient.
     * 
     * @param withdrawalAmount the amount to be withdrawn
     */
    public void withdraw(double withdrawalAmount) {
        if (amount > withdrawalAmount) { // Check for sufficient balance
            amount -= withdrawalAmount; // Deduct the withdrawal amount
            System.out.println(withdrawalAmount + " has been withdrawn from your account.\n" +
                    "Remaining balance: " + amount); // Display the updated balance
        } else {
            System.out.println("Insufficient balance. Current balance: " + amount); // Insufficient balance message
        }
    }

    /**
     * Deposits a specified amount into the account.
     * 
     * @param depositAmount the amount to be deposited
     */
    public void deposit(double depositAmount) {
        amount += depositAmount; // Add the deposit amount to the balance
        System.out.println(depositAmount + " has been deposited to your account.\n" +
                "Current balance: " + amount); // Display the updated balance
    }

    /**
     * The main method is the entry point of the program.
     * It provides a menu for the user to perform deposit or withdrawal operations.
     * 
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Bank object with an initial balance of 10,000
        Bank obj = new Bank(10000);

        boolean flag = true; // To control the menu loop
        while (flag) {
            // Display transaction options to the user
            System.out.println("\nEnter 1 for Deposit \nEnter 2 for Withdrawal \nEnter 3 for Exit");
            int transactionType = sc.nextInt(); // Take input for transaction type

            switch (transactionType) {
                case 1:
                    // If user chooses to deposit
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble(); // Input deposit amount
                    obj.deposit(depositAmount); // Call deposit method
                    break;

                case 2:
                    // If user chooses to withdraw
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawalAmount = sc.nextDouble(); // Input withdrawal amount
                    obj.withdraw(withdrawalAmount); // Call withdraw method
                    break;

                case 3:
                    // If user chooses to exit
                    flag = false;
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    break;

                default:
                    // Handle invalid transaction type
                    System.out.println("Invalid choice. Please enter a valid number (1, 2, or 3).");
                    break;
            }
        }
    }
}
