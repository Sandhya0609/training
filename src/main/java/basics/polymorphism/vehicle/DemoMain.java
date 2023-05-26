package basics.polymorphism.vehicle;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        List<Vehicle> vehicleList=new ArrayList<Vehicle>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorcycle());

        for(Vehicle V:vehicleList){
            V.drive();
        }

    }
}
