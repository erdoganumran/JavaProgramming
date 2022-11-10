package day17_While_DoWhile;

public class FreqOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Java Python";
        int frequency = 0;

        while ((str.contains("Java "))){
           str = str.replaceFirst("Java ","");
           frequency++;
        }
        System.out.println(frequency);
        System.out.println(str);


        System.out.println("------------------------------------------------");


        String sentence= "cat cat dog dog dog cat cat cat cat cat cat dog";
        int countCat=0;

        while (sentence.contains("cat")){// here we say like if we sentence contains cat, so this boolean will be true, if it is true then go to next line
            sentence = sentence.replaceFirst("cat ", "");// it will delete cat word. but we don't how many cats we have that is wahy we use while here.
            // in every step it will check if the sentence has cat word, if has fist cat will replace with "" and count will up
            countCat++;//every step count will increase 1 to up like it will count
        }
        System.out.println("countCat = " + countCat);// we delete cat 8 times here
        System.out.println(sentence);

        System.out.println("-------------------------------------------------------");


        String s= "java java python java java python java java python java java python ";
        int countJava =0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")) {
            if (s.contains("java"))
            {
                s= s.replaceFirst("java ", "");
                countJava ++;
            }
            if (s.contains("python"))
            {
                s=s.replaceFirst("python ","");
                countPython++;
            }
        }

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);
        System.out.println("s = " + s);



    }
}
