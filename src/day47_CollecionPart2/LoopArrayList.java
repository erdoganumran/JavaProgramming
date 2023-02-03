package day47_CollecionPart2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(500);
        nums.add(511);
        nums.add(522);
        nums.add(533);
        nums.add(535);
        nums.add(544);
        nums.add(557);
        nums.add(568);
        nums.add(575);
        nums.add(499);

        for (Integer num : nums) {
            System.out.print(num);
        }
        System.out.println();
        System.out.println("------------------------");

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+"|");
        }
        System.out.println();
        System.out.println("------------------------");

        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.print(nums.get(i) +"|");
        }
        System.out.println();
        System.out.println("------------------------");

        //looping using forEach method. Lambda expression -> don't confuse with for each loop
        //work for just collections
        nums.forEach(n -> System.out.print(n +"|"));
        System.out.println();
        System.out.println("------------------------");

        nums.removeIf(p-> p>500);
        System.out.print(nums);








    }
}
