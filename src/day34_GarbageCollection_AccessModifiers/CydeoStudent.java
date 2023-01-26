package day34_GarbageCollection_AccessModifiers;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class CydeoStudent {
    public String studentName;
    public static  String schoolName;

    public CydeoStudent(String studentName) {
        this.studentName = studentName;
    }
    static {
        schoolName="Cydeo School";
    }

    public static void main(String[] args) {
        CydeoStudent c1= new CydeoStudent("Umran");
        CydeoStudent c2= new CydeoStudent("Eren");
        System.out.println(c1.studentName+ c1.schoolName);
        System.out.println(CydeoStudent.schoolName);
        System.out.println(c1.schoolName);
    }
}

