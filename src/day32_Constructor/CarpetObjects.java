package day32_Constructor;

import day31_Constructors.CapitalOne;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet object1= new Carpet(3.0,4.0,5.0, true);
        System.out.println(object1);
        Carpet object2= new Carpet(10,5,6,false);
        System.out.println(object2);
        System.out.println(object2.calcCast());
        System.out.println(object1.width);
    }
}
