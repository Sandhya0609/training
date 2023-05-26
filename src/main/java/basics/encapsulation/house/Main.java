package basics.encapsulation.house;

public class Main {
    public static void main(String[] args) {
        House house=new House();
        house.setAddress("hghghjghghh");
        house.setNumRooms(7);
        house.setSquareFootage(345.9f);
        System.out.println("Address: "+house.getAddress());
        System.out.println("Rooms: "+house.getNumRooms());
        System.out.println("Square area:"+house.getSquareFootage());


    }
}
