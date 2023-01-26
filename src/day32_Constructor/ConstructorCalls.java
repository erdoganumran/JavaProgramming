package day32_Constructor;

import java.time.temporal.ChronoUnit;

public class ConstructorCalls {

    public ConstructorCalls(){//cons. can not contain itself
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int i){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1= new ConstructorCalls();
        System.out.println();
        System.out.println("---------------------------------------");
        ConstructorCalls obj2= new ConstructorCalls(10);
        System.out.println("---------------------------------------");
        ConstructorCalls obj3= new ConstructorCalls("Umran");
    }


}
