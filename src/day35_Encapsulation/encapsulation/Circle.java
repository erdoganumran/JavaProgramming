package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi;

    public static double calcArea;
    public static double calcPerimeter;

    static {
        pi=3.14;
    }
    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;//it is just to read the value, that is why it returns a value
    }

    public void setRadius(double radius) {//it is set for value, not to get a value, that is why it is void
        if(radius<=0){
            System.err.println("Radius can not be zero or smaller than zero.");
            System.exit(0);
        }
        this.radius = radius;
    }

    public double calcPerimeter(){
       calcPerimeter= pi*radius*2;
        return calcPerimeter;
    }
    public double calcArea(){
        calcArea= pi*radius*radius;
        return calcArea;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", "+
                "perimeter=" + calcPerimeter() +", "+
                "area=" + calcArea() +
                '}';
    }
}
/*

	2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()



 */