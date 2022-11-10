package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 50;
        int n3 = 80;

        boolean med1 = n1 < n2 && n1 > n3 || n1 > n2 && n1 < n3;
        boolean med2 = n2 < n3 && n2 > n1 || n2 > n3 && n2 < n1;
        boolean med3 = n3 < n1 && n3 > n2 || n3 > n1 && n3 < n2;// boolean m3 = !med1 && !med2

        if (med1) {
            System.out.println(n1);
        }
        if (med2) {
            System.out.println(n2);
        }
        if (med3) {
            System.out.println(n3);

        }
    }
}

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */