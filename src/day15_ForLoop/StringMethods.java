package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.isEmpty());//true

        String str2 = "               ";
                //white spaces is blank not empty

        System.out.println(str.isBlank());//true

        boolean r1 = str2.isBlank();
        System.out.println(r1);//true "" or "     " are both blank

        String str1 = "asdf wsde";
        System.out.println(str1.isBlank());//false

        System.out.println("-----------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true


        System.out.println("------------------------------------------------------");

        String sentece = " My favorite programming language is Java";

        boolean hasCSharp = sentece.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava = sentece.toLowerCase().contains("java");// this is only way if we have upper and lover case
        //boolean hasJava2 = sentece.equalsIgnoreCase(sentece).contains("java");  it gives error
        System.out.println(hasJava);// true

        System.out.println("----------------------------");

        String input1 = " I love Java";
        String input2 = "JAva";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains("Java"));//true
        System.out.println(input1.toLowerCase().contains("Java")==input2.toLowerCase().contains("Java"));//true
//in  order to ignore case sensitivity we can use lowercase or uppercase version of string
        String a= "Wooden Spoon";
         boolean x = a.toLowerCase().startsWith("wo");
        System.out.println(x);//true
        boolean y = a.toLowerCase().endsWith("on");
        System.out.println(y);//true






    }
}
