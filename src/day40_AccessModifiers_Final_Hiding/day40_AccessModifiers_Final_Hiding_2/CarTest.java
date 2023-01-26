package day40_AccessModifiers_Final_Hiding.day40_AccessModifiers_Final_Hiding_2;
import day40_AccessModifiers_Final_Hiding.Car;
public class CarTest {
    public static void main(String[] args) {
         Car c= new Car();
       // c.model="M3";//default. accessible in dif class in same package but this one is dif package
        //c.engine=2.00;//protected.  accessible in the all classes in the same package inherited,  tjhis is in a dif package
        c.year=2019;//public is the only type of data accessible for all classes inside and outside
        //c.door is private. not accessible in dif class in same package. private is accessible just on the same class.


    }
}
