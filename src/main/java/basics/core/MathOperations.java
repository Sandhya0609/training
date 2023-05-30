package basics.core;
//Write a program that displays a menu with options 1. Add 2. Sub Based on the options chosen,
// read 2 numbers and perform the relevant operation. After performing the operation, the
// program should ask the user if he wants to continue. If the user presses y or Y,
// then the program should continue displaying the menu else the program should terminate

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Boolean flag = false;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int num1, num2;
            num1 = s.nextInt();
            num2 = s.nextInt();
            System.out.println("Sum of the given numbers :" + (num1 + num2));
            System.out.println("Subtraction  of the given numbers:"+(num1-num2));
            System.out.println("Do you want to continue , Y or N");
            if("Y".equalsIgnoreCase(s.next())){
                flag = true;
            }else{
                flag = false;
            }
        }while(flag);
    }

}


