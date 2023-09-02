package BootCamp.day1;

public class Main {
    public static void main(String[] args) {
        String a= "abc";   //string pool
        String b= new String("abc");
        String c= "abc";
        String d= new String("abc");
        System.out.println(a==b);//false
        System.out.println(b==d);//false
        System.out.println(a==c);//true
        System.out.println(a.equals(c));//true
        System.out.println(a.equals(b));//true
        System.out.println(b.equals(d));//true

    }
}
