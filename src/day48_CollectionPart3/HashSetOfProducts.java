package day48_CollectionPart3;

import Day46_CollectionsPart1.Product;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts {
    public static void main(String[] args) {
        //create set collection and new products
        Set <Product>set = new HashSet<>();
        set.add(new Product("apple",5));
        set.add(new Product("mushroom",6));
        set.add(new Product("parsley",3));
        set.add(new Product("watermelon",8));
        set.add(new Product("onion", 4));
        set.add(new Product("banana", 3));

        System.out.println(set);

        System.out.println("---------------");
        for (Product product : set) {
            System.out.println(product.getPrice());
        }

        System.out.println("-------------");
        set.forEach(p-> System.out.println(p.getPrice()));

        System.out.println("---------------------");

    }
}
