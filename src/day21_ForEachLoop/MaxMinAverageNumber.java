package day21_ForEachLoop;

public class MaxMinAverageNumber {
    public static void main(String[] args) {
        int []numbers ={10,5,4,20,100,0,-50};
        int max=numbers[0];
        int min=numbers[0];
        int sum=0;
    /*    for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];

        }}*/

        for(int each: numbers){
            if(each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
            sum+=each;
        }


        System.out.println(max);
        System.out.println(min);
        System.out.println(sum/(numbers.length));
    }
}
