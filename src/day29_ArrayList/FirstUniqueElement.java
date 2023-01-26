package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(100);
        numbers.add(200);
        numbers.add(400);

        System.out.println(numbers);

        for (Integer nums: numbers){
            int count=0;
            for (Integer element:numbers) {
                if (nums.equals(element)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(nums);
                break;
            }
        }

    }
}
/*
	1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
 */