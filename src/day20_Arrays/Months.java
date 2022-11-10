package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Months {
    public static void main(String[] args) {
        String [] months= {"January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November","December"};//0~11 index numbers(length-1)
        int num=7;
        System.out.println(Arrays.toString(months));//will give all months
        System.out.println(months[num-1]);//will give specific month

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("----------------------------------------------------------");

        for (int i = months.length-1; i >=0; i--) {
            System.out.println(months[i]);
        }

    }
}
