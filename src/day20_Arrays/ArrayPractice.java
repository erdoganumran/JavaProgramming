package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int []num= {10, 20, 50, 70};
        System.out.println(Arrays.toString(num));

        System.out.println("-------------------------------------------");
        int []scores= new int[5];// i have 5 elements here
        scores[1]=10;// 1 is will be second score
        scores[scores.length-1]=50;// it will give last index number
        scores[3]= 75;
        System.out.println(Arrays.toString(scores));//[0, 10, 0, 75, 50]

    }
}
