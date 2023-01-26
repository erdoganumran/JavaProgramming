package day34_GarbageCollection_AccessModifiers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Circle {// class name with Circle

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;


    public Circle(double radius){
        this.radius=radius;
       // pi=3.14;//cons run multiple time for multiple objects. so never use constructor to set the static value. it creates more job for compiler
        //cons is just for instances not static. for static we will set a static block and, it will execute just one time
    }
    static {
        pi=3.14;//public static String name=3.14; is an easier way but in the future in some example, we wil need this because we will need multiple steps to set it for ex. arrayList so we cant use = with them to assign directly. that is wht we have static block
        //but if it just one step you can it in just ine step
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
/*public static void main(String[] args) {//main method is static, so it accepts static variables. but main method can run just inside the class not outside class,
    //it means when we call this class outside of this class, static variables (pi, name etc.) won't be initialized in that class. main method will be executed just inside the class.
    //this the reason why it is static
    pi=3.14;
    name="Circle";
    numbers=new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    System.out.println(pi);
    System.out.println(name);
    System.out.println(numbers);

}*/
}
