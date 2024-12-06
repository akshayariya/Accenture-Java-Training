package Tester;

import java.util.Scanner;

public class PalindromeNumber {

    public void checkPalindrome(int org) {
        int num = org; // 121
        int rev = 0;

        while (num > 0) {
            int digit = num % 10; // 1 2
            rev = (rev * 10) + digit; // 1 136 
            num = num / 10; //12 2
        }

        if (org == rev) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeNumber num1 = new PalindromeNumber();

        System.out.println("Enter the number to check:");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a valid number");
        } else {
            num1.checkPalindrome(num);
        }

        sc.close();
    }
}