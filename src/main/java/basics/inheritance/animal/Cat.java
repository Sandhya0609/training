package basics.inheritance.animal;

public class Cat extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat is a Herbivores");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cat is a Diurnal animal..");
    }
}
