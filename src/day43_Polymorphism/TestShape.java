package day43_Polymorphism;

import java.awt.image.CropImageFilter;

public class TestShape {
    public static void main(String[] args) {
        Shape s1= new Shape();
        s1.draw();

        Shape s2= new Circle();
        s2.draw();

        Shape s3= new Square();
        s3.draw();
        s3= new Triangle();
        s3.draw();//Drawing a shape because I don't have overridden version of method in Triangle Class.
        // it will call parent class method


    }
}

    class Circle extends Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    class Shape {
        public void draw(){
            System.out.println("Drawing a shape");
        }
    }

    class Triangle extends Shape {

    }

    class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
    }

