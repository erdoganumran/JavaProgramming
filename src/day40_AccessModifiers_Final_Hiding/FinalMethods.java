package day40_AccessModifiers_Final_Hiding;

public class FinalMethods {
    public void method1(){
        System.out.println("Method-1");
    }
    public static final void staticMethod(String word){
        System.out.println("Static Method");// if it is final you can not override it at the below class. a final class can not be extended(inherited)
    }
}

class Sub extends FinalMethods{

    public void method1(){
        System.out.println("Method-1 in sub class");// this is overriding method as you see above there is one more method in a different class with same name with no parameters
    }
 /*   public static void staticMethod(String word){
        System.out.println("Static method in sub class");
    }*/
}
