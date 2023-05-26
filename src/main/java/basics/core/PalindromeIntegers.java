package basics.core;

import java.util.Scanner;
//Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2) I/P:1004 O/P:4001
//        While Loop

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Integer:");
        int num = s.nextInt();
        int temp = num;
        int lastDigit, sum = 0;

        while (num > 0) {
            lastDigit = num % 10;
            sum = (sum * 10) + lastDigit;
             //System.out.println("lastDigit="+lastDigit+" sum="+sum+" num="+num);
            num = num / 10;
        }
        //Reverse of the given number:
        //System.out.println(sum);
        if(sum==temp){
            System.out.println(sum+ " is a Palindrome");
        }else{
            System.out.println(sum+ " is  not a Palindrome");
              }


    }
}

