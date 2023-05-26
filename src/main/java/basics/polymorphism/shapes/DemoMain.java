package basics.polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());

        for (Shape S : shapeList) {
           S.calculateArea();

        }
    }
}
