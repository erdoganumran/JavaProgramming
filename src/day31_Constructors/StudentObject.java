package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student st1= new Student("Daniel", 34, 'm', 'a', 12345);
        Student st2= new Student("Sarah", 32, 'f', 'b', 12346);
        Student st3= new Student("Jack", 44, 'm', 'c', 12347);
        Student st4= new Student("Alex", 46, 'm', 'd', 12348);
        Student st5= new Student("Mary", 24, 'f', 'f', 12349);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);

        ArrayList<Student> list= new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));
        Student[]Students= {st1, st2, st3, st4, st5};
        System.out.println(list);
        System.out.println(Arrays.toString(Students));



    }
}
