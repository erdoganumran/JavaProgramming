package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";

        String str2 = str.replace("Java" , "Python");// we should assign it
        str = str.replace("Java" , "Python");


        System.out.println(str);
        System.out.println(str2);


        String email = "ugullee@gmail.com";
        email= email.replace("gmail", "hotmail");

        System.out.println(email);

        String sentence = "Java java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2= sentence.replace("Python", "");
        String sentence3= sentence2.replace("java", "");
        String sentence4 = sentence3.replace("    "," ");
        System.out.println(sentence2);
        System.out.println(sentence3);
        System.out.println(sentence4);

        String s= "Dog Dog Dog Dog Dog Dog Dog Dog ";
        String s2 = s.replace("Dog","Cat");
        System.out.println(s2);//Cat Cat ....
        System.out.println(s2.replace("Cat","Lion"));//Lion Lion ...

        String s3 ="C# is fun, C# is cool";
        String s4= s3.replace(" C#", " C++");// just wanna change one C#
        System.out.println(s4);

        String s5 = "Umren";
        s5 = s5.replace("e", "a");// it will replace all e letters
        System.out.println(s5);

        System.out.println("------------------------------------------------");

        String result= "Java Java Java";
        result = result.replaceFirst("Java" , "Python");// it will replace just the first word matched
        System.out.println(result);//Python Java Java

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        String a ="Java";
         a = a.replaceFirst("a", "o");
        System.out.println();//Jova
        String a1 =  a.replaceFirst("va", "vo");//Jovo you have spesify the word you want to change
        System.out.println(a1);












    }
}