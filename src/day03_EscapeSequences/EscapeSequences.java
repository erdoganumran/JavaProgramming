package day03_EscapeSequences;

/*escape sequences must be given with double quote

    \ :this slash always refers to sequences
    \n : starts a new line
    \t : paragraph space
    \\ :single backslash. causes a backslash to be printed
    \" : double quote. Causes a double quotation mark to be printed.

 */

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java\nPython\nC#");

        System.out.println("---------");

        System.out.println("hello cydeo! how are you all today? \n it's nice to see you all?\n what classs do we have next weekend?");

        System.out.println("-----------");

        System.out.println("\tjava is a cool programming language");

        System.out.println("-----");

        System.out.println("/  \\"); //in order to print one backward slash

        System.out.println("---------");

        System.out.println(" my favorite TV show is \"Game of Thrones\""); // in order to print double quote use/"..../"


    }
}
