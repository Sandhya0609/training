package assignments;

import java.util.Scanner;

//Write a program to check if a given number is prime or not For Loop
public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        int num=s.nextInt();
         boolean flag = false;
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

