package utilities;

import java.util.Arrays;

public class StringUtility {

    public static void printEachChar(String str){//since this is static, we can call this method with the name of packageand then with class
        //print each character of the given String
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverses the given string anf return the reversed string
    public static String reverse(String str){

        String result="";// I want to return reverse value, that is why it is not a void method
        for (int i=str.length()-1; i >=0; i--) {
           result+=str.charAt(i);
        }
        return result;// it is mandotory to return a value
    }

    //checks if the given string is palindrome, return boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);

    }

    //checks if the given string is anagram, return boolean
    public static boolean anagram(String str1, String str2){

        char [] ch1= str1.toCharArray();
        Arrays.sort(ch1);
        char [] ch2= str2.toCharArray();
        Arrays.sort(ch2);

        return  Arrays.equals(ch1,ch2);

    }

    //remove the duplicated characters
    public static String removeDuplicates(String str){
        String newStr= "";
        for(int i=0; i<str.length();i++){
            if(!newStr.contains(""+ str.charAt(i))){
                newStr+=str.charAt(i);
            }
        }
        return newStr;
    }

    //






}
