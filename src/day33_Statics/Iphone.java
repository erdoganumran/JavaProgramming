package day33_Statics;

public class Iphone {

    public static String brand="Apple";// all the objects have same value
    public String model;
    public double price;
    public static String OS="iOS";
    public String color;
    public String size;
    public static String madeIn= "China";
    public static boolean hasBattery=true;//static method belong to class,you can call them through the class name.
    // instances belong to object
    //objects come from the class
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;

    public void printModelAndPrice(){// if we have any instance method should be instanced but instance methods accepts static variables
        System.out.println(model+": "+ price);
        System.out.println(OS);

    }
    public static void printHasBatter(){// if we have any static method, it should include just static variables
        System.out.println(hasBattery);
    }
    public static void OS(){
        System.out.println(OS);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
