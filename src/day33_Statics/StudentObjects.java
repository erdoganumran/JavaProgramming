package day33_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student s1= new Student("Umran");
        Student s2= new Student("Eren", 'f');
        Student s3= new Student("Adam", 'f', 27);
        Student s4= new Student("eren", "etegfg", 'f',24 );
        System.out.println(s1==s2);
        System.out.println(s3);
        ArrayList<Student> list= new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        System.out.println(list);

    }
}
