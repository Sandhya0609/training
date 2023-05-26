package basics.encapsulation.employee;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Salary:");
        double salary=s.nextDouble();

        Employee employee=new Employee();
        employee.setHiredate(new Date());
        employee.setName("Laura");
        System.out.println("Name of the Customer is:"+employee.getName());
        System.out.println("Hire date is:"+employee.getHiredate());

        if(salary>0){
            employee.setSalary(salary);
            System.out.println("Salary of the Employee is:"+employee.getSalary());
        }else{
            System.out.println("Wrong Entry.Enter the correct Salary");
        }

    }
}
