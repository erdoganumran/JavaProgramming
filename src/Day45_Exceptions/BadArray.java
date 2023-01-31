package Day45_Exceptions;

public class BadArray {
    public static void main(String[] args) {

        int[] numbers= {1,2,3};

        for (int i = 0; i <= numbers.length; i++) {
            //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 in Exception Class
            System.out.println(numbers[i]);
        }

        System.out.println("Learning exception");
    }
}
