package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        ArrayList<String> removed= new ArrayList<>();

        for (String s : list) {
            if(!removed.contains(s)){
                removed.add(s);
            }
        }
        System.out.println(removed);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();// evertime we use keyword new, it creates a new object at the heap
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);//false
        System.out.println(list1.get(1)==list2.get(1));//true
        System.out.println(list1.equals(list2));//it will compare each element of array with another array, if one of them is not matching it will give false otherwise returns true







    }
}
