package basics.inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals=new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());
        for(Animal A:animals){
            A.eat();
            A.sleep();
        }
    }
}
