package day17_While_DoWhile;

public class FreqOfWord2 {
    public static void main(String[] args) {
        
   
    
    String sentence = "Cat Cat Dog Dog";
    int n = 0;
    
    for (int i= 0; i<=sentence.length()-3; i++)// if you dont give -3 here it is not ganna extend and will be out of range for some i+3
    {
        if (sentence.substring(i, i+3).equalsIgnoreCase("cat"))
            n++;
        
    }
        System.out.println("n = " + n);
}
}