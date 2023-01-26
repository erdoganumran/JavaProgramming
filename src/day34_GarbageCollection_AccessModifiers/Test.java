package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.*;//utilities is package name

public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("---------------------------------");
        int a=10, b=20,c=100, d=200;

        System.out.println(sum(a,b));// I don't need to package name which is MathUtility anymore. I can just call sum method and, then I can start to use it.

        int r=subtraction(d,c);
        System.out.println(r);

        System.out.println(maxNumber(c,d));


    }
}
