package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData=100;//always reachable
    static int defaultData=200;// access modifier:default
    private static int privateData=300;

 /*   public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);//in the same package
    }*/

    public static void method2(){
        System.out.println("Public");
    }
    static void method3(){
        System.out.println("Default");
    }
    private static void method4(){
        System.out.println("Private");
    }
}
