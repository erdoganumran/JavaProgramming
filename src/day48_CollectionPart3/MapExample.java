package day48_CollectionPart3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> items2= new ArrayList<>();
        items2.add(10);
        items2.add(5);

        Map <String, Double> items= new HashMap();
        //to add key and value use out method
        items.put("Apple", 2.53);
        items.put("Banana", 1.99);
        items.put("Strawberry", 4.89);
        items.put("Milk", 2.30);
        items.put("Cherry", 6.99);

        //to get size
        System.out.println(items.size());//5

        System.out.println(items);

        System.out.println(items.isEmpty());//false

        //to get value
        System.out.println(items.get("Apple")); //2.53
        System.out.println(items.get("Cherry"));//6.99

        //to get all values
        System.out.println(items.values());

        //remove a key and value
        items.remove("Milk");
        System.out.println(items);

        //
        System.out.println("Is Apples there?: " + items.containsKey("Apple"));
        System.out.println("Is Milk there?: " + items.containsKey("Milk"));

        //changing the key
        items.replace("Apple", 3.5);
        System.out.println(items.get("Apple"));

        items.put("Milk", 4.6);
        System.out.println(items.get("Milk"));

        //increase price of cherries 2 dollar
        items.replace("Cherry", items.get("Cherry")+2);
        System.out.println(items.get("Cherry"));

    }
}
