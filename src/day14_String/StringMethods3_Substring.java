package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        //substring(beginning index, ending index)

        String word= "Cydeo School";
        String brand= word.substring(0, 4+1);// it will stop at the before ending index
        System.out.println(brand);//Cydeo

        String st1 = word.substring(6, word.length());
        System.out.println(st1);//School

        System.out.println("--------------------------");


        String s1 ="Java Programming Language";
        String s2= s1.substring(0, s1.indexOf(" "));//Java
        String s3= s1.substring(s1.indexOf(" ")+1, s1.lastIndexOf(" "));//Programming
        String s4= s1.substring(s1.lastIndexOf(" ")+1);

        System.out.println(s2);
       System.out.println(s3);
        System.out.println(s4);










    }
}
