package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double Radius = 5.5;

        double PI = 3.14;
        double Diameter = Radius*2;
        double Area =  Radius*Radius*PI;
        double Perimeter = Diameter*PI;

        System.out.println("Radius = " + Radius);
        System.out.println("Diameter = " + Diameter);

        System.out.println("Area = " + Area);
        System.out.println("Perimeter = " + Perimeter);

    }

}
//	3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
//			PI, radius, diameter, area, perimeter
//
//					Hints: 	PI = 3.14
//							area = radius * radius * PI
//							Perimeter = 2 * radius * PI