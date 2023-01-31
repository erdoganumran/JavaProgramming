package Day45_Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        String str = "Selenium";


        try {
            System.out.println("str.length() = " + str.length());
            System.out.println(str.charAt(100));
        } catch (Exception e) {
            System.out.println("Enter correct index");
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Bye..");

        System.out.println("------------------------------");

        try {
            System.out.println("str.length() = " + str.length());
            System.out.println(str.charAt(2));
        } catch (Exception e) {
            System.out.println("Enter correct index");
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Bye..");

        System.out.println("------------------------------");

        try {
            System.out.println("str.length() = " + str.length());
            System.out.println(str.charAt(100));
        } catch (Exception e) {
            System.out.println("Enter correct index");
            return;//it is gonna stop here, but still print finally
        }finally {
            System.out.println("Finally block");
        }

        System.out.println("Bye..");//this will not printed after return

        System.out.println("------------------------------");

    }
}
