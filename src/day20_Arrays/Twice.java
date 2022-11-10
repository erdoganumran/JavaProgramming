package day20_Arrays;

public class Twice {
    public static void main(String[] args) {
        char[] chars= {'a', 'a', 'b', 'c', 'c', 'd', 'd', 'd'};

        for (int j = 0; j < chars.length; j++) {

            int freq = 0;
            char unique = chars[j];

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == unique) {
                    freq++;
                }
            }
            if (freq==2)
                System.out.println(chars[j]);
        }



    }
}
