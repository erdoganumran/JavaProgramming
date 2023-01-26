package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        for (int i = 0, num=10; i < 6; i++, num+=10) {
           numbers.add(i,num);
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i)*2);
        }
        System.out.println(numbers);
    }
}
