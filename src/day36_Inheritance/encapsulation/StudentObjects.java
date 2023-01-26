package day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {
        Student s1= new Student("Umran", 2, 'M', 'F');
        System.out.println(s1);
        //s1.setAge(20);
        s1.setGender('M');
        s1.study();


    }
}
