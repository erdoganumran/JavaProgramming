package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


    int num1 = -25;//negative number
    int num2 = +34;//positive number


        System.out.println("-------------------------------------------");

        int a= 5;
        ++a; //pre increment: increases the value by 1 right away

        System.out.println(a);

        --a; // pre decrement : decreases the value by 1 right away

        System.out.println(a);

        System.out.println("---------------------------------------");
        int b= 100;

        System.out.println(++b);
        int c=100;
        System.out.println(c++);// post increment: first passes the current value, then increases the value by 1
        System.out.println(c);// the previous increment will increase the value here

        System.out.println("---------------------------------------");
        int d=200;
        System.out.println(--d);// pre operator increases the value by 1 immediately right away
        System.out.println(d--);// post decrement will decrease the value at the next step
        System.out.println(d);

        System.out.println("-----------------------------------");
         int z = 45;
        System.out.println(++z); //46
        System.out.println(z++);//46
        System.out.println(z);//47
        System.out.println("z = " + z);

        System.out.println("------------------------------------");
        int f= 30;
        System.out.println(--f);//29
        System.out.println(f--);//29
        System.out.println(f);//28
        System.out.println("f = " + f);



    }

}

