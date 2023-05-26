package basics.inheritance.person;

public class Employee extends Person {
    double salary;
    public double getsalary(Double d) {
        System.out.println("Employee salary is :"+d);
        return salary;
    }
}
