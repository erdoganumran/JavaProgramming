package day15_ForLoop;

public class LoopPractices {
    public static void main(String[] args) {


        for (int i = 15; i<=45; i++ )
        {System.out.print(i + " ");
        }

        System.out.println();

        for ( int b = 100; b>=50; b--) {
            System.out.print(b + " ");// if we dont have iterator it will be infinite loop
        }
        System.out.println();

        System.out.println("----------------------------------------------------------------");

        for (int c=0; c<=55; c++ ) {

            if (c % 2 == 0) System.out.print(c + " ");
        }

    }
}