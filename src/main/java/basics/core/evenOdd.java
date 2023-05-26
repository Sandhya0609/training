package basics.core;
//Write a program to check if a given number is odd or even.

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=s.nextInt();
        if(num%2==0){
            System.out.println("NUmber is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
