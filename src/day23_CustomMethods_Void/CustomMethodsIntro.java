package day23_CustomMethods_Void;

public class CustomMethodsIntro {

    public static void greeting() {//custom method: I have create it myself. this is method greeting

        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        // it is not gonna be executed. every single method must be indepented
    }

    public static void main(String[] args) {// this is main method
        greeting();// i call another method here. the greeting method will be executed first---Hello Cydeo How are you today?
        System.out.println("hello");// second this will be printed
        greeting();// i call another method here// third this will be printed agaib
    }// you can create your method everywhere. but make sure it is not inside another method. should be independent
}

        /**
         * access modifier-specifier-returnType-methodName(Parameter){}==public static void main(String[] args){}
         *specifier-access modifier. you can switch like that
         *void means I don't want to return anything, does not return any spesific data. it just performs the function
         */

