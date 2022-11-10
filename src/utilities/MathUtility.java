package utilities;

public class MathUtility {

    //the sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //the sum of two doubles
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    //the subtraction of two integer
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    //the subtraction of two doubles
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    //the multiplication of two integer
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    //the multiplication  of two doubles
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    //the division of two integer
    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    //the division of two doubles
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    //checks if the given integer number is even
    public static boolean evenNumber(int num1) {
        boolean n = false;
        if (num1 % 2 == 0) {
            n = true;
        }
        return n;
    }

    //checks if the given double number is even
    public static boolean odd(double num1) {
        boolean n = false;
        if (num1 % 2 == 1) {
            n = true;
        }
        return n;
    }

    //returns the max number from given two int numbers
    public static int maxNumber(int n1, int n2) {
        int max = n1;
        if (n2 > n1) {
            max = n2;
        }
        return max;
    }

    //returns the max number from given two int doubles
    public static double maxNumber(double n1, double n2) {
        double max = n1;
        if (n2 > n1) {
            max = n2;
        }
        return max;
    }

    //returns the min number from given two int numbers
    public static int minNumber(int n1, int n2) {
        int min = n1;
        if (n2 < n1) {
            min = n2;
        }
        return min;
    }

    //returns the min number from given two int doubles
    public static double minNumber(double n1, double n2) {
        double min = n1;
        if (n2 < n1) {
            min = n2;
        }
        return min;
    }

    //returns square of integer
    public static int square(int num) {
        return num * num;
    }

    //returns square of double
    public static double square(double num) {
        return num * num;
    }

    //returns cube of integer
    public static int cube(int num) {
        return num * num * num;
    }

    //returns cube of double
    public static double cube(double num) {
        return num * num * num;
    }
}

