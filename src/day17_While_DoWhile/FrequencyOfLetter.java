package day17_While_DoWhile;

public class FrequencyOfLetter {
    public static void main(String[] args) {
        String str = "AABBCCAAAADDAA";
        char n = 'A';
        int freq= 0;
        
        for (int i=0; i<=str.length()-1; i++) {
             if (str.charAt(i) == n)
             freq ++;

        }
        System.out.println("freq = " + freq);
    }
}
