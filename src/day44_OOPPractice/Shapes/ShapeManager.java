package day44_OOPPractice.Shapes;

import java.util.List;

public class ShapeManager {
    public static Shape buildShape(String type){

        Shape shape= null;

        switch (type.toLowerCase()){
            case "shape":
                shape=new Shape();
                break;
            case "diamond":
                shape=new Diamond();
                break;
            case "square":
                shape=new Square();
                break;
        }
        return shape;
    }

    public static void drawSquare(Square square){
        square.draw();
    }

    public static void drawShape(Shape shape){
        shape.draw();
    }

    public static void drawDiamond(Diamond diamond){
        diamond.draw();
    }
    public static void drawShape(List<Shape> shapes){
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

//Collection is a class. list is a collection type.

}
