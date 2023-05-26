package basics.core;

import java.util.ArrayList;

public class ToStringMethod {
    public static void main(String[] args) {
       ArrayList <String> s =new ArrayList<String>();
       s.add("Sam");
       s.add("John");
       // System.out.println(s);
       System.out.println(s.toString());
        //Whenever we try to print any Object reference, then internally toString() method is called.

    }
}
