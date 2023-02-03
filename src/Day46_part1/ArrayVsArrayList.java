package Day46_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int[] numsArray = {30,40, 100,5,6};
        String [] days= new String[7];
        days[0]= "Monday";

        Object[] onj= {2, "apple", false};

        ArrayList<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        Collection<Integer> lis3= new ArrayList<>();

        list1.add(44);
        list1.add(50);
        list1.add(60);

        System.out.println(numsArray[0]);
        System.out.println(list1.get(0));


    }
}
