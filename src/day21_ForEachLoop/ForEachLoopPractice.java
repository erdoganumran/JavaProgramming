package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String [] words= {"Java Programming",  "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String word : words) {
            char a = word.charAt(0);
            char b = word.charAt(word.length()-1);
            System.out.println(""+ a+ b);
        }

    }
}
