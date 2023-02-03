package Day46_part1;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> v= new Vector<>();
        v.add("water");
        v.add("tea");
        v.add("green tea");

        for (String s : v) {
            System.out.println(s);
        }
        System.out.println(v.size());
        System.out.println(v.get(2));



    }
}
