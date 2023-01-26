package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();//new ArrayList<>(); this part creates object and will import class
                //it has to be non-primitive.
        numbers.add(10);// the size will increase the size of array by one//index 0
        numbers.add(20);//index 1
        numbers.add(30);//index 3
        numbers.add(40);//index 4
        numbers.add(50);//index 6
        numbers.add(60);

        numbers.add(2,25);// index numbers will skip after this index numbers. it s a function of inserting//index 2
        //insert=eklemek
        numbers.add(5,45);//index 5
        System.out.println(numbers);

        System.out.println(numbers.size());//returns me total number of the elements
        System.out.println("lastIndex = " + (numbers.size()-1));

        int num= numbers.get(3);//inboxing
        System.out.println(num);
        Integer num2= numbers.get(3);
        System.out.println(num2);

        System.out.println("----------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));// we will get each element of arrayList. return you your element
        }
        System.out.println("----------------------------");

        numbers.set(2,100);// it will switch the element with a new one
        System.out.println(numbers);

        System.out.println("------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace the element at given index with a new element
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);// we have seven elements and size is 7

        employees.remove(0);// it will decrease the size at the given index number so remaining names change their indexes numbers by decrease by 1, shift to the left

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);// it removes element at that index

        System.out.println(employees);

        employees.remove( employees.size() -1 );// removes the last element. it as an overloaded method.

        System.out.println(employees);//[Neira, Hulya]

        employees.remove("Neira");//it will remove Neira. it accepts objects?(non-primitives)
        System.out.println(employees);//[Hulya]. if have same object it will remove the first one

        // so we have two remove method. i can remove with index or elements itself.

        System.out.println("-------------------------------------------");

        boolean r1 = employees.remove("Hulya");// it accepts objects. removes the given object from arrayList
//with this boolean you can make sure that object was removed
        System.out.println("r1 = " + r1);
        System.out.println(employees);

        boolean r2 = employees.remove("");
        System.out.println("r2 = " + r2);
        System.out.println(employees);










    }
}
