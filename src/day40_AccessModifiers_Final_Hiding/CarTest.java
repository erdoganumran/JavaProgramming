package day40_AccessModifiers_Final_Hiding;

public class CarTest {// just one public class in a class
    public static boolean hasBattery;
    int x = 30;// it is accessible in where in a same package is if default data type

    static {
        hasBattery = true;
    }
    public void battery(){
        System.out.println(hasBattery);
        System.out.println(x);
    }

    public String toString() {
        return "Car{" +
                "x=" + x +
                '}';
    }
}
class A extends CarTest{
    public A() {
    }
    public void model(){
        System.out.println("A model");
    }
}