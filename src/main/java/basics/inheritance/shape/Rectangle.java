package basics.inheritance.shape;

public class Rectangle extends Shape{
    static int length;
    static int width;
    public void getArea(){
        int area=length*width;
        System.out.println("The area of the rectangle is: "+area);

    }

    }

