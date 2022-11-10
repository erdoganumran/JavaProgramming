package day06_PrimitiveTypeCastings;

import java.sql.SQLOutput;

public class PrimitiveCastings {
    public static void main(String[] args) {


        byte a = 100;
        short b = a;// this is implicit casting, assigning small primitives to a bigger primitive directly
        // short b= (short)a;

        int c = (int) b;// this (int) is not necessary
        //int c = (int)b

        long d = c;
        //       (long) c

        float e = d;
        double f = e;
        //if a have larger primitives I can not assign them to smaller one.need to castted manually.

        System.out.println(a + " : " + f);

        System.out.println("---------");

        int x =55;
        short y = (short) x;//explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;// it shows the max number of short at the print
        System.out.println(j +":"+ k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l +":"+ m);

        double n= 10.8;
        int o = (int)n;
        System.out.println(n+":"+o);

        double d1 = 20.5 ;
        short s1 = (short) d1;
        System.out.println(d1 +":"+ s1);

        float r1 = 30.5F;
        long l1 = (long) r1;





    }

}
