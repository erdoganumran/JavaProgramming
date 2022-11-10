package day21_ForEachLoop;

public class reverseName {
    public static void main(String[] args) {


        String[] names = {"umran", "eren", "buse", "ayse", "dilara", "esra", "gulsen", "yasemin", "emine", "alper"};


        for (String name : names) {
            String reverseName = "";
            for (int i = name.length()-1; i >=0; i--) {
                reverseName += name.charAt(i);
            }
            System.out.println(reverseName);

        }


    }
}
/*

2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */