package Tester;

import java.util.*;

public class PrimeNumber {

    public void checkPrimeNumber(int num) {
        boolean flag = false;

        if (num == 2 || num == 3) {
            flag = true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }

            }
        }

        if (flag == true) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumber num1 = new PrimeNumber();

        System.out.println("Enter the number to check:");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a valid number");
        } else {
            num1.checkPrimeNumber(num);
        }   

        sc.close();
    }
}