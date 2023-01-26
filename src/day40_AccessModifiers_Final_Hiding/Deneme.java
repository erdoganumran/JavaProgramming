package day40_AccessModifiers_Final_Hiding;

public class Deneme {
    public static void main(String[] args) {


        CarTest c = new CarTest();
        System.out.println(c);
        c.battery();
        c.x=50;
        System.out.println(c.x);
        A a1= new A();
        a1.model();
        a1.battery();
    }

}
