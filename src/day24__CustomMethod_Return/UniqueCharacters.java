package day24__CustomMethod_Return;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aabccddfee";

        for (int i=0;i<str.length();i++) {
            int frequency = frequencyy(str, str.charAt(i));//frequency represents the method below. frequency==count; will be for every char
            if (frequency==1){
                System.out.println(str.charAt(i));
            }
        }


    }



    public static int frequencyy(String str, char ch){
        int count=0;
        for (char each:str.toCharArray()){
            if (each==ch){
                count++;// for every char this for loop will be repeated.
            }
        }
        return count;
    }



}
