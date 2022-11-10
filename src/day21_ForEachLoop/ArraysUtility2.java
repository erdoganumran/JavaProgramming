package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String [] students= {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aoron", "Daniel"};
        String [] earlyBirds= Arrays.copyOf(students, 3);//being copied 3 elements "Elif", "Sinem", "Gunay"
        //starts copying from first element
        System.out.println(Arrays.toString(earlyBirds));//Elif", "Sinem", "Gunay"

        int []numbers= {1,2,3,4,5,6,7,8,9};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------------------------------------");
//1.02

        char [] ch1= {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i'};
        char [] ch2= Arrays.copyOfRange(ch1, 2,6);
        System.out.println(Arrays.toString(ch2));//cde , index number 6 is not included it is exlcuded

        int[] i= {1,2,3,4,5,6,7,8,9};
        //System.out.println(Arrays.copyOfRange(i,2,6)); it will give hashcode. always i have to do it like down
        int []b= Arrays.copyOfRange(i,2,6);
        System.out.println(Arrays.toString(b));//[3, 4, 5, 6]

    }
}
