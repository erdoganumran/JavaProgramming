package day48_CollectionPart3;

import Day46_CollectionsPart1.Product;
import day33_Statics.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();

        dataMap.put("url", "qa3.track.com");
        dataMap.put("username", "user66");
        dataMap.put("password","123456");
        dataMap.put("browser", "chrome");
        dataMap.put("truckDriver", "Bob");
        dataMap.put("storeManager", "John");

        //keySet -> returns set with all the keys in the map
        //values-> return with all the values in the map
        System.out.println("KEYS");
        for (String key: dataMap.keySet()){
            System.out.println(key);
        }

        System.out.println("VALUES");
        for (String value : dataMap.values()) {
            System.out.println(value);
        }
//IN WORK ENV, YOU CAN USE THIS FOR EX. GET DEV ENV PASSWORD AND PUT IT

        System.out.println("KEYS AND VALUES");
        for (String keys : dataMap.keySet()) {
            System.out.println(keys+ "|"+ dataMap.get(keys));
        }

        //other way to print key and values one by one
        dataMap.forEach((k,v) -> System.out.println(k +"|"+ v));

        Map<Integer, Product> studentMap= new HashMap<>();
        Map<String, String[]> data = new HashMap<>();
        Map<Integer, List<String>>data3 = new HashMap<>();
        Map<Integer, List<Integer>>data4 = new HashMap<>();
        Map<Integer, Map<Integer, Product>> data5 = new HashMap<>();
        //there are multiple options that you can do, you can modify it


    }
}
