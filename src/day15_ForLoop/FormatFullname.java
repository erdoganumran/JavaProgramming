package day15_ForLoop;

import java.util.Locale;

public class FormatFullname {
    public static void main(String[] args) {

        String name ="umRan",
        lastname = "SCHOOL";
        //name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        // to make a string from the char you can "" before the assignment as below
        name = ("" + name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();

        lastname= (lastname.substring(0,1).toUpperCase()) + lastname.substring(1).toLowerCase();

        System.out.println(name + " " + lastname);


    }
}
