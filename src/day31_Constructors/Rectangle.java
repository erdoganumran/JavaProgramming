package day31_Constructors;

public class Rectangle {
    public double length, width;// every object will have length and width

    public Rectangle(double length, double width) {//is a must.this constructor gets executes when you create an object from this Rectangle class.
        this.length = length;
        this.width = width;
    }//cons will get executed for each

    public double calcArea(){//method1. if you need addiional inf you can add between parentheses calcArea()
        return length * width;
    }

    public double calcPerimeter(){//method2
        return 2 * (length + width);
    }

    public String toString() {// method3= to display this part
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


}


/*
create a custom class named Rectangle
    Attributes:
        length, width
    Add a constructor that can set all the fields
    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
     	toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
 */
