package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
         String str="aaabbbcccdeeffhggt";
         //str.split(""); this is a non primitive array
        ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));// i return array to array list
        System.out.println(list);
        String unique="";
        for (String each : list) {
            if (Collections.frequency(list, each) == 1){
                unique+=each;
            }
        }
        System.out.println(unique);
    }
}
