package day21_ForEachLoop;

import java.beans.beancontext.BeanContext;
import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        int i=0;
        for (String each:items){
            if (each.equals("Gloves")){
            System.out.println(i);}
            i++;
        }

        for (String each:items){
            if (each.equals("iPad")){
                System.out.println("Ipad is contained");}
            i++;
        }

        String[] str= new String[items.length];
        for (int j = 0; j < items.length; j++) {
            str[j] = items[j]+ " - " + prices[j] +  " - "+ itemIDs[j];
        }
        System.out.println(Arrays.toString(str));

    }
}
/*

3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

*/