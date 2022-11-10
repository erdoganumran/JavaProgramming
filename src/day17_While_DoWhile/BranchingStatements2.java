package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                // break;
                continue;
            }


            System.out.println(i);


        }

        System.out.println("----------------------------------------------------");

        for (int n = 1; n <= 10; n++) {

            if (n % 2 == 0) {
                continue;
            }
            System.out.println(n);
        }

            System.out.println("----------------------------------------------------");

            for (int a = 1; a <= 10; a++) {
                if (a % 2 != 0) {
                    continue;
                }
                System.out.println(a);

            }








    }

}