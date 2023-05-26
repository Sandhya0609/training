package basics.inheritance.animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is a Carnivores..");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Dog is a Diurnal animal...");
    }
}
