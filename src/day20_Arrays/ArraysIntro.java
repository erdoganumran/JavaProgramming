package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {// this bracket at the main method reserve array

        //String[] names= new String[5];
        String[] names;// String names[]; also you can put that brackets here
        names = new String[5];// array size is fixed. every names will have index numbers

        //use this type of array if you dont know how many elements you have and you dont what those elements are
        names[0]="gunay";
        names[1]="neira";
        names[2]="suat";
        names[3]="hulya";
        names[4]="micheal";// it wont print name 4 because it wil print last one Umran
        names[4]="umran";
       // names[5]="muhtar";// it will give ArrayIndexOutOfBoundsException: because for five 0~4 will be index numbers

// when you get [Ljava.lang.String;@2f7c7260 this kind of error, called hashcode, means here is not executed
        System.out.println(Arrays.toString(names));//we make sure we assigned the names to this string or it will be null null null null null
// we make sure we assigned the names to this string




        int [] name= new int[5];
        System.out.println(Arrays.toString(name));//0,0,0,0,0

        System.out.println("--------------------------------------------------------");

        String[]days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // if you know which elements you have

        //index number =0,         1           2          3           4           5          6
        System.out.println(Arrays.toString(days));

        int number =2;
        if(number<1 || number>7){
            System.out.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);




    }
}
//default value is not assigned value to anything for non=primitives=null, primitives = 0 or 0.0 for boolean false