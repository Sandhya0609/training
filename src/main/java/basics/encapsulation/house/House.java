package basics.encapsulation.house;

public class House {
    private String address;
    private float squareFootage;
    private int numRooms;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(float squareFootage) {
        if(squareFootage>0);
        this.squareFootage = squareFootage;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        if(numRooms>0);
        this.numRooms = numRooms;
    }


}
