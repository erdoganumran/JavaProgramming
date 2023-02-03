package Day46_CollectionsPart1;

import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
    public static void main(String[] args) {
        List<Integer> list= new LinkedList<>();
        //reference decides what to access, to acces methods linkedList methods we need casting
        list.add(4000);
        list.add(1000);
        list.add(500);
        list.add(60000);
        list.add(700);

        System.out.println(list.get(0));
        System.out.println(((LinkedList<?>) list).getFirst());
        ((LinkedList) list).addFirst(1);
        ((LinkedList) list).addLast(10000);

        System.out.println(list);

    }
}
