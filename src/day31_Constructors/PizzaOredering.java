package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOredering {
    public static void main(String[] args) {

        ArrayList<Pizza> list=new ArrayList<>();
        Pizza order1= new Pizza('L', 2,2);
        Pizza order2= new Pizza('M', 3,3);
        Pizza order3= new Pizza('S', 4,4);
        for (int i = 0; i < 100; i++) {
            list.addAll(Arrays.asList(order1,order2,order3));

        }
        System.out.println("Total numbers of pizzas " + list.size());

        double price=0;

        for (Pizza pizza : list) {
            price+=pizza.calcCost();
        }
        System.out.println("Total price "+ price);

    }
}
