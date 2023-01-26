package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
//SORT: sorts in a descending order
        Collections.sort(list);//import java.util.Collection; collection utility class
        System.out.println(list);

        System.out.println("-------------------------------------");
//REVERSE: reverse given arrayList.  Collections.reverse(list2);
        ArrayList<Character> list2=new ArrayList<>();
        list2.addAll(Arrays.asList('A','B', 'C', 'D', 'E'));
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("-------------------------------------");
//SWAP: swaps given indexes at the given array list.  Collections.swap(list3,4,1);
        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,4,1);
        System.out.println(list3);

        System.out.println("-------------------------------------");
//MAX: It returns max number at the given array list.
//MIN: It returns max number   at the given array list.
       int max= Collections.max(list3);
       int min= Collections.min(list3);
        System.out.println("--------------------------------------");
//REPLACEALL: replaces all the matching elements with the new one

        ArrayList<Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,1,4,5,8,9,10,2,4,3,1,7,6));
        Collections.replaceAll(list4, 1,0);// Collection is a utility class here. we call replaceAll method from this class.
        System.out.println(list4);

        System.out.println("--------------------------------------");

//FREQUENCY: finds freq of element. it works for all array lists.
        int frequency = Collections.frequency(list4,0);
        System.out.println("frequency = " + frequency);

        ArrayList<String> titles= new ArrayList<>(Arrays.asList("QA","Sdet", "Developer","QA", "Sdet", "Scrum Master", "BA", "BA", "QA"));
        boolean b= Collections.frequency(titles, "QA")==Collections.frequency(titles,"Sdet");
        System.out.println(b);
        System.out.println(Collections.frequency(titles, "QA")==Collections.frequency(titles,"Sdet"));




    }

}
