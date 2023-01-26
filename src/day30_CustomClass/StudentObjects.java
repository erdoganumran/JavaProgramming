package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {


        Student st1 = new Student();//Student() is constructor name
        st1.setInfo("Umran", 'F', 34,"202234eu", 'A' );

        Student st2= new Student();
        st2.setInfo("Eren", 'M', 34, "202224eu", 'C');

        Student st3= new Student();
        st3.setInfo("Buse",'F', 25, "202233TR", 'C');
        Student st4= new Student();
        st4.setInfo("Dilara",'F', 27, "202227TR", 'B');
        Student st5= new Student();
        st5.setInfo("Yasemin",'F', 36, "202236TR", 'A');

        Student[] students={st1,st2, st3,st4, st5};

        ArrayList<Student > earlyBirds=new ArrayList<>();//gradeA
        ArrayList<Student > angryBirds=new ArrayList<>();

        for (Student each : students) {
            System.out.println(each.name);
            if(each.grade=='A'){
               earlyBirds.add(each);
            }else {angryBirds.add(each);}
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

    }
}
