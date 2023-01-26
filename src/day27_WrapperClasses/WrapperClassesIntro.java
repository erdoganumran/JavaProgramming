package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1=200;

        Integer n1=num1;//autoboxing. converting prim to object here in this line
        int num2=n1;//unboxing. it is implicitly done that s why i can assign wrapper class to primitive or prim to wrapper class
        // collection and map classes only support instance of a class. primitive are not the classes.
        // you dont need to casting they are done implicitly

        System.out.println("---------------------------------------------");

        Integer integerValue= 100;
        long longValue= integerValue; // if it is in the range it will accept another primitive if you convert wrapper class to primitives

        Byte b1=25;
        byte a1=b1;
        double a2=b1;

        System.out.println("--------------------------------");
        int num3=200;
        //Double num4=num3;  it doesn't accept because it doesn't allow convert from prim to wrapper class. you can just convert it same wrapper class
        Integer num=num3;

        System.out.println("----------------------------------");
        Integer z=900;
        Integer y=z;

        System.out.println("---------------------------------------------------");

        int[]numbers1={1,2,3,4,5};
        Integer[]numbers2={1,2,3,4,5};




    }
}
