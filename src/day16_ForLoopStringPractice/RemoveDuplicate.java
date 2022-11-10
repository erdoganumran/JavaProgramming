package day16_ForLoopStringPractice;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str= "AABBCBCC";

        String str3 ="";

         for (int i =0; i <= str.length()-1; i++)
         {  String str2 = "" + str.charAt(i);//represent the all the index number of str(start from 0)
             // here we used charAt method. if we want to convert it string variable we have to use ""+ before it
             if (!str3.contains(str2))// if the character not contain in the
             str3 += str2;//the character will be added the result

         }

        System.out.println(str3);
    }
}
/*
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */