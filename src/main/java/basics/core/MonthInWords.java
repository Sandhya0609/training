package basics.core;

import java.util.Scanner;
//Write a program to print month in words, based on input month in numbers

public class MonthInWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the month in numbers: ");
        int num=s.nextInt();
        String monthName    =   null;
        switch (num){
            case 1:
                monthName = "January";
                System.out.println(monthName);
                break;
            case 2:
                monthName="February";
                System.out.println(monthName);
                break;
            case 3:
                monthName="March";
                System.out.println(monthName);
                break;
            case 4:
                monthName="April";
                System.out.println(monthName);
                break;
            case 5:
                monthName="May";
                System.out.println(monthName);
                break;
            case 6:
                monthName="June";
                System.out.println(monthName);
                break;
            case 7:
                monthName="July";
                System.out.println(monthName);
                break;
            case 8:
                monthName="August";
                System.out.println(monthName);
                break;
            case 9:
                monthName="September";
                System.out.println(monthName);
                break;
            case 10:
                monthName="October";
                System.out.println(monthName);
                break;
            case 11:
                monthName="November";
                System.out.println(monthName);
                break;
            case 12:
                monthName="December";
                System.out.println(monthName);
                break;
            default:
                System.out.println("Invalid month in number");

        }
    }
}
