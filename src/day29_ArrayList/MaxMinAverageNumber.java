package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(100);
        numbers.add(200);
        numbers.add(400);
        numbers.add(300);
        numbers.add(50);
        numbers.add(300);

        Integer max=numbers.get(0);
        Integer min=numbers.get(0);
        Integer sum=0;

        for (Integer number : numbers) {
            sum+=number;
            if(number>max){
                max=number;
            }
            if(number<max){
                min=number;
            }
        }
        System.out.println("average = " + (double)sum/numbers.size());
        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}
