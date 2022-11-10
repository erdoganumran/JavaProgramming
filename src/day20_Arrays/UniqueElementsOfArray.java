package day20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {
        String[] words = {"java", "java", "c#", "python", "python"};


        for (int i = 0; i < words.length; i++) {
            String unique = words[i];
            int freq = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(unique)) {
                    freq++;
                }
            }// this inner loop responsibility is finding the frequency for word[i]
            if (freq == 1) {
                System.out.println(unique);
            }
        }


    }
}
