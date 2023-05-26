package basics.core;
//Initialize a character variable in a program and
// if the value is alphabet then print "Alphabet" if it’s a number
//  print "Digit" and for other characters print "Special Character"
import java.util.Scanner;

public class CharVariablesAlphabets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        char ch=s.next().charAt(0);
        /**
         * In the 7-bit ASCII character set, ASCII code 48 is represented by the character 0 also known as the zero.
         * 1-9 numbers lies between 49-57
         */
        if(ch>=48 && ch<=57){
            System.out.println("DIGIT");
        }else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
            System.out.println("ALPHABET");

        }else{
            System.out.println("SPECIAL CHARACTER");
        }


    }
}
