package Day45_Exceptions;

import java.io.File;

public class TryCatch {
    public static void main(String[] args) {

        try {
            String str= "jAVA";
            System.out.println(str.charAt(0));//i might have problem here
            System.out.println(str.charAt(5));// at that point code won't continue  in try clock and goes to catch statement but outside try-catch code wil continue and won't crash program
            // it will go catch block here
            System.out.println(str.charAt(1));//it wont print this line

        }catch (Exception e){//catch block only runs if there is an error in try block
            System.out.println("Exception happened in try block and was caught");
            //you can create onr more try-catch in catch
           //e.printStackTrace();//long description
           //e.getMessage();
        }

        System.out.println("After try catch block");// but will print this line
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
