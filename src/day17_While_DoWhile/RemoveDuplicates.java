package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCCAAF";

        String result = "";

        for (int i=0; i<=str.length()-1; i++ ){

            if(result.contains("" + str.charAt(i))) {//contains only accept string data type
                continue;//skips
                //break; is for exiting

            }
            result+=str.charAt(i);
        }

        System.out.println(result);

        }
    }

