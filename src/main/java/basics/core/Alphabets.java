package basics.core;
//convert from upper case to lower case and vice versa of an alphabet
//and print the old character and new character as shown in example (Ex: a->A, M->m).
import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char ch1=s.next().charAt(0);
        if(ch1>='A' && ch1<='Z'){
            System.out.println(ch1+"->"+Character.toLowerCase(ch1));
        }else {
            System.out.println(ch1+"->"+Character.toUpperCase(ch1));

        }
    }
}
