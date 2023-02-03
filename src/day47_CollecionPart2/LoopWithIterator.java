package day47_CollecionPart2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {
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

        Iterator<Integer> it= nums.iterator();// when you create an object, you put an pointer

        //call hasNext method
        //hasnext returns true if there is still nwxt value
        //returns false when it reaches the end or empty
        System.out.println(it.hasNext());

        //gives ypu the element
        System.out.println(it.next());
        System.out.println(it.next());//pointer changed every with every sout
        System.out.println(it.next());
        System.out.println(it.next());  //or you can lose

        System.out.println();

        System.out.println("-----------------------------");

        while (it.hasNext()){
            System.out.print(it.next()+"|");
        }
      //  System.out.print(it.next());//throws exception. no more element
        System.out.println();
        System.out.println("------------------");
        Iterator<Integer> it2= nums.iterator();
        //what is the fid between for each loop and iterator?
        //we can remove object while looping

        while (it2.hasNext()){
            int val= it2.next();
            if (val>540){
                it2.remove();
            }
        }

        System.out.print(nums +"|");
    }
}
