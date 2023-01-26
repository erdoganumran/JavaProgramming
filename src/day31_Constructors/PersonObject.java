package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1=new Person("Umran", 'f', 34);// concraction will be executed seperatly for each object
        Person person2= new Person("Daniel", 'm', 48);
        Person person3=new Person("Sarah", 'f', 34);
        Person person4= new Person("Jack", 'm', 46);
        person4.age=30;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

    }
}
