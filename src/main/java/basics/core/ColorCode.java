package basics.core;
//Write a program to print the color name, based on color code.
// If color code in not valid then print "Invalid Code".
// R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

import java.util.Locale;
import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Color Code:" );
        String color=null;

        // switch statement to check the color
        //convert to uppercase use method toUppercase();
        switch (s.next().toUpperCase()){
            case "R":
                color ="Red";
                System.out.println("R->"+color);
                break;
            case "G":
                color = "Green";
                System.out.println("G->"+color);
                break;
            case "Y":
                color="Yellow";
                System.out.println("Y->"+color);
                break;
            case "B":
                color="Blue";
                System.out.println("B->"+color);
                break;
            case "W" :
                color="White";
                System.out.println("W->"+color);
                break;
            case "O":
                color="Orange";
                System.out.println("O->"+color);
                break;
            default:
                System.out.println("Invalid Code");

        }

    }
}
