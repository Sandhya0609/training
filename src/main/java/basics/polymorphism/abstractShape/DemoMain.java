package basics.polymorphism.abstractShape;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        List<Shape> shapeList=new ArrayList<Shape>();
        shapeList.add(new Rectangle());
        shapeList.add(new Circle());
        for(Shape s:shapeList){
            s.calculateArea();
        }

    }
}

