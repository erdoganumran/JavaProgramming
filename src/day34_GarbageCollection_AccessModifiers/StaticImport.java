package day34_GarbageCollection_AccessModifiers;

//import static day34_GarbageCollection_AccessModifiers.Circle.pi;//pi is imported
import static day34_GarbageCollection_AccessModifiers.Circle.*;
//import static packageName.className.*;-import everything
//import static packageName.className.staticMember;

public class StaticImport {
    public static void main(String[] args) {

        System.out.println(pi);//I can call it directly without class name
        //System.out.println(Circle.pi);
        System.out.println(name);
        System.out.println(numbers);
    }
}
