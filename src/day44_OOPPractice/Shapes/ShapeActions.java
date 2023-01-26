package day44_OOPPractice.Shapes;

import java.util.ArrayList;
import java.util.List;

import static day44_OOPPractice.Shapes.ShapeManager.*;
public class ShapeActions {
    public static void main(String[] args) {
        drawDiamond((Diamond) buildShape("diamond"));
        drawSquare((Square) buildShape("square"));
        drawShape(buildShape("shape"));

       List<Shape> myList= new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Diamond());
        myList.add(new Shape());

        drawShape(myList);
        
    }
}
