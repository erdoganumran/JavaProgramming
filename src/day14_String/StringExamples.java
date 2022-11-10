package day14_String;

public class StringExamples {
    public static void main(String[] args) {

        String str1="Cydeo";
        String str2="Cydeo";
        String str3=new String("Cydeo");
        String str4=new String("Cydeo");

        System.out.println(str1==str2);//true because they are in same pool as same text
        System.out.println(str3==str4);//false
        System.out.println(str2==str3);//false. it returns boolean

        System.out.println(str3.equals(str4));//true
        System.out.println(str2.equals(str3));//true

        str1= str1.toLowerCase();//cydeo. it returns new String
        str2 = str2.toUpperCase();//CYDEO. it returns new String
        System.out.println(str1);// we assing str1 to lower case at the previous line
        System.out.println(str2);//we assing str1 to upper case at the previous line
        System.out.println(str3.toLowerCase());//cydeo. we didn't assing the number to Lower case here. in just print statement it shows in lower case version.
        System.out.println(str4.toUpperCase());//CYDEO
        System.out.println(str3);//Cydeo because we didn't assign it before



        //Sequences of Characters (starts from 0)
        String a = "Umran";
        System.out.println(a.charAt(1));//m
        a.charAt(1);
        System.out.println(a);//umran
        System.out.println(a.length());//5
        System.out.println(a.charAt(a.length()-1));//n



    }
}
