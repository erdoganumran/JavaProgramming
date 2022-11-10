package day25_CustomMethod_Overloading;


import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        ArraysUtility.printEachElement(new int[] {1,2,3,4,5});
        ArraysUtility.printEachElement(new double[] {1.0,2.0,3.0,4.0,5.0});
        ArraysUtility.printEachElement(new char[] {'1','2','3','4','5'});
        ArraysUtility.printEachElement(new String[] {"1.0","2.0","3.0","4.0","5.0"});
        System.out.println("-------------------------");

        int []arr={5,7,2,8,9,1,0,7,10,7,3};
        int max1= ArraysUtility.maxNumber(arr);
        System.out.println(max1);
        System.out.println("----------------------");
        double []arr2={5.0,7.0,2,8,9,1,0,7,10.0,7,3};
        double max2= ArraysUtility.maxNumber(arr2);
        System.out.println(max2);


        System.out.println("--------------------------");

        System.out.println(ArraysUtility.contains(arr, 10));
        System.out.println(ArraysUtility.contains(arr,7));

    }

}
