package basics.core;

import java.util.ArrayList;

public class GetClass {
    public static void main(String[] args) {

        //instantiating String class
        String student=new String();
        //getClass method does not take in any parameters.
        System.out.println(student.getClass());

        //object class instantiation
        Object obj=new Object();
        System.out.println(obj.getClass());

        ArrayList list=new ArrayList();
        System.out.println(list.getClass());
    }
}
