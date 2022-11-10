package day24__CustomMethod_Return;

public class RemoveDuplicatedCharacters {
    public static void main(String[] args) {
        String str = "abccddeeffffgg";
        str=duplicatedCh(str);
        System.out.println(str);


    }

    public static String duplicatedCh(String str) {
        String result = "";
        for (char each : str.toCharArray()) {
            if (!result.contains("" + each)) {
                result += each;
            }
        }

        return result;
    }


}

//1. create a method that can remove duplciated characters from a string and returns the new value
////					"aaabbcccc" ===> "abc"