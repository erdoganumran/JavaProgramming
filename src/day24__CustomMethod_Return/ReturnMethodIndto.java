package day24__CustomMethod_Return;

public class ReturnMethodIndto {

    public static void main(String[] args) {

        String str = "Java";//str="Java" here we assigned to complete reverse method. we can call this data from method below.
        //this method i call and and str="Java" here we assigned.
        String result= reverse(str);// here i created a new string to assigned the result of method below to this new string. this will create me reuse this data.
        // if i cal data like reverse("Java"); i cant use this data in this function/method
        if(str.equals(result)){
            System.out.println(str+ " is a palindrome");
        }
        else {
            System.out.println(str+ " is not a palindrome");
        }
    }

    public static String reverse(String str) {//String reverse(String str)--> this is method. str is a data we have take.
// if it is reverse instead of void, I can use this data in different methods.
        String reversed = "";// this is temporary value to reverse str.
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;// i want to use this data outside of the method. and i use return.
    }

}
