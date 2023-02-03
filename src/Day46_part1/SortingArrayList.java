package Day46_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");

        System.out.println("Before sorting");
        System.out.println(list);

        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);

        List<Product> list1= new ArrayList<>();
        list1.add(new Product("apple", 2));
        list1.add(new Product("strawberry", 5));
        list1.add(new Product("parsley", 3));
        list1.add(new Product("mushroom", 4));


        System.out.println(list1);

        //how to sort ot with price
        //for this we have comparable interface
        //so have implement this interface to product class and override its method in product class
        Collections.sort(list1);
        System.out.println(list1);

        Product p1= new Product("spoon", 25.34);
        Product p2= new Product("chair", 60);
        System.out.println(p1.compareTo(p2));

    }
}
