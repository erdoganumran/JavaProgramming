package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String str2 = "";
        String str3 = null;//null


        for (int i = str.length()-1 ; i>= 0; i--)
        {str2 += str.charAt(i);}
        System.out.println(str2);

        System.out.println("str3 = " + str3);
    }

}


/*
	1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
 */