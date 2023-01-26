package day43_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {
    public static void main(String[] args) {
        Shape[]shapes= new Shape[4];//Object Array
        shapes[0]= new Square();
        shapes[1]=new Triangle();
        shapes[2]=new Circle();
        shapes[3]=new Shape();

        for (Shape shape : shapes) {
            System.out.println(shape.getClass());
            System.out.println(shape.getClass().getName());
            System.out.println(shape.getClass().getSimpleName());
            shape.draw();
            System.out.println("------");
        }

        List<Shape> shapes1= new ArrayList<>();//this is polymorphism as well. because list is upper class of arraylist
        shapes1.add(new Circle());
        shapes1.add(new Triangle());

        //• Reference type can be parent or interface , object can be any extending
        //or implementing child class
        //• Reference type decides what is accessible

    }
}
