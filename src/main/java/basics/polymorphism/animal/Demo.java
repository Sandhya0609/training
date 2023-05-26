package basics.polymorphism.animal;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Animal> animalList=new ArrayList<Animal>();

        /**
         * Created both Cat and Dog objects and added to List Animal
         */
        Cat c=new Cat();
        Dog d=new Dog();
        animalList.add(c);
        animalList.add(d);

        animalList.add(new Cat());
        animalList.add(new Dog());

/**
Extended For Loop to call methods
 */
        for (Animal animal:animalList){
            animal.makeSound();
        }











    }
}
