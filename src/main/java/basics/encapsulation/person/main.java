package basics.encapsulation.person;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //The Scanner class is used to get user input.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of a person:");
        //next.int() is the next token of an input as int.
        int age=s.nextInt();

        Person person=new Person();
        person.setName("Peter");
        person.setAddress("3456 buford hwy,Atalnta-30089");
        System.out.println("Name:"+person.getName());
        System.out.println("Address is :"+person.getAddress());

        if( age > 0 && age <= 120){
            person.setAge(age);
            System.out.println("Age of the Person is :"+person.getAge());

        }else {
            System.out.println("Enter the age between 0-120..");


        }

    }
}
