package day47_CollecionPart2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> list= new LinkedList<>();
        list.add("Mike");
        list.add("John");
        list.add("Emily");
        list.add("Mark");
//first in first out
        System.out.println(list);
        String name= list.remove();
        System.out.println(list);

        name= list.poll();
        System.out.println(list);//remove and poll function is same

        //get the element at the front of the queue without using peek()
        name= list.peek();
        System.out.println(name);
        System.out.println(list);



    }
}
