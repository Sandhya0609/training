package basics.core;
//Write a program to print * in Floyds format (using for and while loop) *

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number of rows to be displayed:");
        int rows;
        rows=s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
