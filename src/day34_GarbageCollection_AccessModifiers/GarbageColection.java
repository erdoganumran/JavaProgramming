package day34_GarbageCollection_AccessModifiers;

import day05_Concatenation.Calculator;
import day30_CustomClass.Dog;
import day30_CustomClass.StudentObjects;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GarbageColection {
    public static void main(String[] args) throws Throwable {

/*      //new GarbageColection().finalize();
        String str=null;//null is only for non prim data types. there is no object here so we can not use any instance method
        //str="Umran";
       // int n=null;->compile error
        System.out.println(str.toUpperCase());*/

        String str="Wooden Spoon";//after line 13, str will be eligible for garbage collection and garbage collector collect and destroy the object
        str=null;//object is unreferenced anymore
        System.out.println(str);

        Car c1= new Car("Toyota");// it is custom object now
        c1=null;//c1 is not in color in line 26 after assigning null. because it is eligible for garbage collection
        System.out.println(c1);

        System.out.println("--------------------------------------");

        Dog dog1=new Dog();//dog1 is reference name
        dog1.name="Lucy";
        System.out.println(dog1);
        dog1= new Dog();// i dont have any reference name here it is eligible for garbage collection.I can assignt it dog1 for to be eligible garbage
        System.out.println(dog1);
        dog1.name="Max";
        System.out.println(dog1);

        System.out.println("--------------------------------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2=list1;//they are pointing the same object, so they will have same elements.
        list2.add(200);
        list2.add(300);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        System.out.println("--------------------------------");

        Student student1= new Student("Umran", 30, 'M', 'B', 14);
        student1.grade='A';
        Student student2= student1;//they are referencing the same object with different reference name
        student2.name="Ahmet";
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String>l1=new ArrayList<>();
        l1.add(0, ":Java");
        ArrayList<String>l2=new ArrayList<>();
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        int a=0;
        int b=a;
        a=7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------");

        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(100);
        ArrayList<Integer>list4=list3;//they are pointing the same object, so they will have same elements.
        list3.add(200);
        list4.add(300);
        list3.add(400);
        System.out.println(list4);
        System.out.println(list3);
        System.out.println("----------------");
        String a1="Umran";
        a1=null;
        String b1=a1;
        System.out.println(a1==b1);
        b1="Eren";

        System.out.println(a1);
        System.out.println(b1);











    }


}
