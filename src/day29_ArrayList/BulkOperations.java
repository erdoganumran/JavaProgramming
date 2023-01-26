package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BulkOperations {
    public static void main(String[] args) {
//ADDALL
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3,4,5,3,3,4,5,9));// instead of calling add method several time we use asList method--> this is a bulk operation

        System.out.println(list);
//REMOVEALL
        list.removeAll(Arrays.asList(3,4,5));// all this number will be removed. you specified the element you want to remove
        System.out.println(list);
//RETAINALL
        list.retainAll(Arrays.asList(1));
        System.out.println(list);// it is opposite of removeAll method. it removes non-matching elements
//ADDALL
        list.addAll(Arrays.asList(100,200,300,400,500,600));
//RETAINALL   list.retainAll(Arrays.asList(100,200,300));
        System.out.println(list);

        System.out.println("----------------------------------");
        ArrayList<String> jobTitles= new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","Sdet", "Developer","QA", "Sdet", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "Sdet"));
        System.out.println(jobTitles);

        System.out.println("--------------------------------------------");

//CONTAINSALL
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1= nums.contains(5);
        boolean re= nums.contains(1)&&nums.contains(2)&&nums.contains(7);//true
        boolean r2= nums.containsAll(Arrays.asList(2,5,20));
        System.out.println(r2);

        /* asList method, returns the array as collectionType. if you have a non primitive array you can directly convert it to the array list by using this aslist method. */
//collection doesnt support any primitive types.

        System.out.println("------------------------------------------------");

        String []names= {"Josh", "Jack", "Daniel", "Shay", "Brenna"};
        ArrayList<String> namesList= new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        //bulk operations only accepts collection type as the argument. String []names is a non-primitive array right now, it should be converted to the collection by method asList as above.
        //but if it is primitive array, you can not convert it directly unless you create a custom method that can convert primitive array to arrayList.

        //ArrayList<String> namesList= new ArrayList<>(Arrays.asList(names)); or you can write like this
        System.out.println(namesList);

        System.out.println("----------------------------------------");

        Integer []arr={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("----------------------------------------------");

        int []array= {1,2,3,4,5,6,7,8};
        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(array));
        System.out.println(list3);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int [] array){
        ArrayList<Integer>list=new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }
        return list;

    }
}
