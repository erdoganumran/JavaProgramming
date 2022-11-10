package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for (char a = 65; a <= 90; a += 1)
            System.out.print(a + " ");

        System.out.println();
        for (int b = 97; b <= 122; b++)
            System.out.print((char) b + " ");

        System.out.println();
        System.out.println("--------------------------");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int b = 122; b >= 97; b--)
            System.out.print((char) b + " ");
        System.out.println();{

        for (char d = 1; d <= 40000; d++) System.out.print(d);}




    }
}
