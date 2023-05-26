package basics.core;

import java.util.Scanner;

    public class Palindrome {
        public static void main(String args[]){
            Scanner s =new Scanner(System.in);
            System.out.println("Enter the String");
            String str=s.nextLine().toLowerCase();
            str.replace(" ","");
            int len=str.length();
            int j=len-1;
            int count=0;
            for(int i=0;i<=len-1;i++) {
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }
                j--;
            }
            if(count==len){
                System.out.println("PALINDROME");
            }
            else{
                System.out.println("Not a Palindrome");
            }

        }
    }
