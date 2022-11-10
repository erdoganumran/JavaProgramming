package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AABCCD";

        String result = "";


        for (int i=0; i<= str.length()-1; i++)
        {char ch =str.charAt(i);// String ch ="" + str.charAt(i); you can write in this way also it will also run
         if (str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i)))
         //charAt ile karakteri bulur ve index ile de o karakterin yerini bulur yani A karakterinin kacinci index no da oldugunu bulur
             // ayni karakterden baska bir index no da varsa o karakter unique degildir ama eger yoksa o karakter uniquedir


         result+= ch;

        }
        System.out.println(result);

    }
}
/*
	3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */