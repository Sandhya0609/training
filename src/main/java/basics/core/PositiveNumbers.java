package basics.core;
//Write a program to check if a given number is Positive, Negative, or Zero.

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=s.nextInt();
        if(num>0){
            System.out.println("The given number is a Positive Number ");
        }else if(num<0) {
            System.out.println("The Given NUmber is a Negative NUmber");
        }
        else{
            System.out.println("The given number is a Zero");
        }
    }
}
