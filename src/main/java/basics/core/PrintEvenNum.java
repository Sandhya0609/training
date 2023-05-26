package basics.core;
//Write a program to print even numbers between 23 and 57, each number should be printed in a separate row.

import java.util.Scanner;

public class PrintEvenNum {
    public static void main(String[] args) {
        for( int i=23;i<58;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
