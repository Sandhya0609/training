package basics.core;

import java.util.Scanner;

//Write a Java program to find if the given number is prime or not.
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        int num = s.nextInt();
        boolean flag = false;
        if (num == 0 || num == 1) {
            System.out.println(num + " is neither prime  not composite ");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
}

