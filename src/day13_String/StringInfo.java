package day13_String;

public class StringInfo {
    public static void main(String[] args) {

        /*String name="Wooden Spoon";// this is an object. if I have same objects "wooden sppon" more than one time, there will ne only one in the heap memory.
//string pool does not take duplicates.
        String name2="Wooden Spoon";
        String name3="Wooden Spoon";
        String name4="Wooden Spoon";

        System.out.println(name==name2);//true
        System.out.println(name2==name3);//true
        System.out.println(name3==name4);//true
        System.out.println(name==name2  && name2==name4);//true

     /*   int n1= 5;
        int n2 =5;

        System.out.println(n1==n2);//true

        int n3 =2;
        int n4 = 8;
        System.out.println(n3>n4);//false
*/

        //new mean is new object new brand

        //String str = new String("Java"); it creates new objects outside StringPool in the Heap. they are not same object anymore.
        String str = new String("Java");
        String str2 = new String("Java");
        System.out.println(str2==str);//false because they are not same anymore with new keyword. two object in the Heap not the String Pool.

        String s1= "Java";//stores in Java Heap
        String s2 = new String("Java");// stored in String Pool
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true. equals check the value.

        //System.out.println("leng" + name.length());*/


String name = "uMrAn eRDogan";
        String firstname = (("" + name.charAt(0)).toUpperCase() +name.toLowerCase().substring(1, name.indexOf(" ")) + " ");
       String lastname = ("" + name.charAt(name.indexOf(" ")+1)).toUpperCase() + name.substring(name.indexOf(" "));


        System.out.println(firstname==name);




    }

}
/*
it is designed for char sequences in java. combination of multiple characters.
0-65000 all these characters are char.
class like a templete.

 */