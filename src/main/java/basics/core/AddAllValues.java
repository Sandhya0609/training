package basics.core;

import java.util.Scanner;

//Write a program to add all the values in a given number and print.
// Ex: 1234->10 For Loop
public class AddAllValues {
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        long num,sum;
        num=sc.nextLong();
        for(sum=0 ;num!=0 ;num/=10)
        {
            sum+=num%10;
        }
        System.out.println("Sum of digits of a number is: "+sum);
    }
}
