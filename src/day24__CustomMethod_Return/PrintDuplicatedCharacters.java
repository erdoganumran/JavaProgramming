package day24__CustomMethod_Return;

public class PrintDuplicatedCharacters {


    public static void main(String[] args) {
        String str = "abccddeeffffgg";
        String str2="";

        for (int i = 0; i < str.length(); i++) {
            int frequency = duplicatedCh(str, str.charAt(i));//char ch==str.charAt(i)). here I call other method down below.
            // then it finishes it will continue with the remaining of this method
            if (frequency==2 && !(str2.contains("" + str.charAt(i)))) {// it will check now, if count =2; after calling and assigning other method
                str2 += ""+str.charAt(i);
            }

        }
      System.out.println(str2);
    }

    public static int duplicatedCh(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {// for each char ch it will be repeated
            if (each == ch) {
                count++;
            }

        }

        return count;
    }


}

//	1. create a method that can print duplciated characters from a string and returns the new value
//					"aaabbcccc" ===> "abc"