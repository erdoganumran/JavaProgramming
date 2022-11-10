package day17_While_DoWhile;

public class ReturnFreqOfAWord {
    public static void main(String[] args) {

        String sentence = "JavaJavaJavaPythonJavaJava";

        int n = 0;

        for (int i = 0; i <= sentence.length()-4; i++)
        { if (sentence.substring(i, i+4).equalsIgnoreCase("Java"))
            n++;
        }
        System.out.println("n = " + n);
    }
}
/*

	2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)



        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"

 */