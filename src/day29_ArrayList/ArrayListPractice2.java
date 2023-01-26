package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String > names= new ArrayList<>(Arrays.asList("Ahmet", "Ali", "Umran", "Eren", "David", "Canan", "Ahmet", "Derya","Dilara", "David"));

        //just keep ahmet and david

        names.retainAll(Arrays.asList("Ahmet", "David"));

        System.out.println(names);


        System.out.println("---------------------------------------------------------");

        String [] nameList= {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String>last= new ArrayList<>(Arrays.asList(nameList));

        last.removeIf(p-> p.charAt(0)=='M');
        nameList= last.toArray(new String[0]);
        System.out.println(Arrays.toString(nameList));









    }
}
