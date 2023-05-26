package basics.inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.drive();

        Vehicle car=new Car();
        car.drive();

        Vehicle truck=new Truck();
        truck.drive();


    }
}
