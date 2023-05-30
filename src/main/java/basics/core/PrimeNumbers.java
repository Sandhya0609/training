package basics.core;
//Write a program to print prime numbers between 10 and 99. For Loop


import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        //prime numbers
        for (int i = 10; i < 100; i++) {
            for (int j = 2; j <= i ; j++) {
                if(j==i){
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;

                }
            }
        }
    }
}