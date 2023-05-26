package basics.polymorphism.person;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Student());
        personList.add(new Teacher());

        for(Person p:personList){
            p.greet();
        }
    }




}
