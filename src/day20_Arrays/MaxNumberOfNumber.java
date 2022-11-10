package day20_Arrays;

public class MaxNumberOfNumber {
    public static void main(String[] args) {
        int []numbers ={10,5,4,20,100,0,-50};
        int max=numbers[0];// we are assuming for the first time the first number of array is the max number
        for (int i = 0; i < numbers.length; i++) {//shortcut for this is arrayName.fori
            if(numbers[i]>max){
                max=numbers[i];//if it is not true it will check the next number[i] if it true max will change to this number
            }
           // for (int i1 = numbers.length - 1; i1 >= 0; i1--) {//shortcut for this is arrayName.forr

        }
        System.out.println(max);

}}
