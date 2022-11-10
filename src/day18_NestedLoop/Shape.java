package day18_NestedLoop;

public class Shape {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");// it will repeat this sout for ten times we didnt use println because we want to see the * nearby other *
                //* * * * * * * * * here in the inner loop it will print like this for total j
                // then it will go outer loop and print j ten times
            }
        }

    }
}

/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */