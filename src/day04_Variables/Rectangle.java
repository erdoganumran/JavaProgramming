package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        double Lenght = 5.5;
        double Width = 10.5;

        double Area = Lenght* Width;
        double Perimeter= (Lenght+Width)*2;

        System.out.println("Lenght = " + Lenght);
        System.out.println("Width = " + Width);
        System.out.println();
        System.out.println("Area = " + Area);
        System.out.println("Perimeter = " + Perimeter);


    }
}
//		2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
//						length
//						width
//
//						area = length * width
//						perimeter =  2 * (length + width)