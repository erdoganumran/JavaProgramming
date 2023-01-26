package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries={"Germany","Turkey", "Australia", "Canada", "Switzerland", "India", "Guatemala", "United States", "United Kingdom" };
//converting  array to array list:
        ArrayList<String> reversed= new ArrayList<>(Arrays.asList(countries));

        reversed.removeIf(p-> p.length()>=10);
//converting  arrayList to array:
        countries= reversed.toArray(new String[0]);// this zero is not important you can give any number. it will take reversed arrayList size as size
        System.out.println(Arrays.toString(countries));


    }
}
