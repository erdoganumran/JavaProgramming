package day40_AccessModifiers_Final_Hiding;

import java.util.Arrays;

public class FinalArrays {
    public static void main(String[] args) {
        final int[] teams= {11,11};// arrays are object, you can change the values but,you can not change the references of the array which has final keyword
        System.out.println(teams[0]);
        teams[0]=15;
        System.out.println(teams[0]);

        int nums[] =new int[]{20,20,20};
        System.out.println(nums);
        nums=new int[]{10,15,20};// you are changing the referance here with new keyword
        System.out.println(nums.toString());
        final int [] finalNums= {23,66,44};
        finalNums[0]=120;
        //finalNums= new int[]{44,55,66}; this will give compile error because you can not change final array's references in the heap

        System.out.println("------------------------------------------------");

        final int a=5;
        final int b=4;
        final int [] xx={a,b};

        xx[0]=10;
        System.out.println(Arrays.toString(xx));

    }
}
