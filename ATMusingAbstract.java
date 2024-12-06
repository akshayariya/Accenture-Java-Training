package Abstraction;

import java.util.Scanner;
import java.util.ArrayList;

class Transactions {
    private String transactionType; // Type of transaction: Deposit or Withdrawal
    private double transactionAmount; // Amount for the transaction
    private double balanceAfterTransaction; // Balance after the transaction

    public Transactions(String transactionType, double transactionAmount, double balanceAfterTransaction) {
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    @Override
    public String toString() {
        // Format transaction details for printing
        return "Transaction Type: " + transactionType + 
               ", Amount: " + transactionAmount + 
               ", Balance After Transaction: " + balanceAfterTransaction;
    }
}

// Abstract class defining an ATM
abstract class ATM {
    double amount; // Account balance

    public void checkBalance() {
        // Display current balance
        System.out.println("Current Balance: " + amount);
    }

    static void test(){};

    abstract public void deposit(double num); // Abstract method for deposit
    abstract public void withdraw(double num2); // Abstract method for withdrawal
}

// SBI ATM implementation
class SbiATM extends ATM {
    private ArrayList<Transactions> transactions; // List to store transaction history

    public SbiATM(double amount) {
        transactions = new ArrayList<>();
        this.amount = amount; // Initialize account balance
    }

    public void addTransaction(String type, double transactionAmount, double balance) {
        // Add a transaction to the history
        Transactions trans = new Transactions(type, transactionAmount, balance);
        transactions.add(trans);
    }

    public void deposit(double depositAmount) {
        amount += depositAmount; // Add the deposit amount to the balance
        System.out.println(depositAmount + " has been deposited to your account.\n" +
                "Current balance: " + amount); // Display the updated balance
        addTransaction("Deposit", depositAmount, amount); // Log the deposit transaction
    }

    public void withdraw(double withdrawalAmount) {
        if (amount >= withdrawalAmount) { // Check for sufficient balance
            amount -= withdrawalAmount; // Deduct the withdrawal amount
            System.out.println(withdrawalAmount + " has been withdrawn from your account.\n" +
                    "Remaining balance: " + amount); // Display the updated balance
            addTransaction("Withdrawal", withdrawalAmount, amount); // Log the withdrawal transaction
        } else {
            System.out.println("Insufficient balance. Current balance: " + amount); // Insufficient balance message
        }
    }

    public void checkTransactions() {
        // Display all transactions in the history
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transaction History:");
            for (Transactions trans : transactions) {
                System.out.println(trans); // Print each transaction
            }
        }
    }
}

// Main class
public class ATMusingAbstract {
    public static Scanner sc = new Scanner(System.in); // Scanner object for user input

    public static void main(String[] args) {
        ATM obj = new SbiATM(10000); // Initialize an ATM object with a starting balance
        boolean flag = true; // To control the menu loop
        while (flag) {
            // Display transaction options to the user
            System.out.println("\nEnter 1 for Deposit");
            System.out.println("Enter 2 for Withdrawal");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for Check Transactions");
            System.out.println("Enter 5 to Exit");
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
                    // If user chooses to check balance
                    obj.checkBalance();
                    break;

                case 4:
                    // If user chooses to check transaction history
                    if (obj instanceof SbiATM) {
                        ((SbiATM) obj).checkTransactions(); // Call checkTransactions method
                    }
                    break;

                case 5:
                    // If user chooses to exit
                    flag = false;
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    break;

                default:
                    // Handle invalid transaction type
                    System.out.println("Invalid choice. Please enter a valid number (1, 2, 3, 4, or 5).");
                    break;
            }
            
        }
    }
}
