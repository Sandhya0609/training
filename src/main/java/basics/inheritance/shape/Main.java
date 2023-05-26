package basics.inheritance.shape;

import java.util.Scanner;

public class Main extends Rectangle{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length:");
        length=s.nextInt();
        System.out.println("Enter the width");
        width=s.nextInt();

       Rectangle area=new Rectangle();
        area.getArea();

    }
}
