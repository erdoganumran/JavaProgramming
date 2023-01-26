package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(250);
        list.add(300);
        list.add(200);
        list.add(400);
        list.add(500);
        list.add(600);
        System.out.println(list);

        int num=1;// it is primitive
        list.remove(num);// it will remove index 1
        System.out.println(list);

        Integer num2= 250;// it is non-primitive
        list.remove(num2);// it will remove non-primitive
        System.out.println(list);
       // list.remove(200);
       // System.out.println(list); it will give out of bound because it will take it primitiev so like index number
       boolean r= list.remove(num2);// we don,t have 250 anymore so it doesn't exist because we remove it at the previous step
        System.out.println(r);//so this is false

        Integer num3=400;
        boolean b= list.remove(num3);// it will remove num3 which is object here in this boolean expression . returns boolean
        System.out.println(b);// true

        System.out.println("-------------------------------------");

        System.out.println(list.size());//5
        list.clear();// it will clear all the array
        System.out.println(list.size());// size is 0 anymore

        System.out.println(list.indexOf(600));//-1 because we deleted all the array at the last step with clear method

        ArrayList<Character> characters= new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        System.out.println(characters.indexOf('A'));//0
        System.out.println(characters.lastIndexOf('A'));//5

        System.out.println("---------------------------------------------");

        Boolean bool= characters.contains('A');//TRUE
        boolean bL= characters.contains('A');//TRUE
        Boolean bool2= characters.contains('Z');//false
        boolean bL2= characters.contains('Z');//false
        System.out.println(bool);
        System.out.println(bL);
        System.out.println(bool2);
        System.out.println(bL2);

        System.out.println("------------------------------------------");

        boolean r2= list.isEmpty();
        System.out.println(r2);
        System.out.println(list);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> numbers= new ArrayList<>();

        //Bulk operation:Collection Type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);









    }
}
