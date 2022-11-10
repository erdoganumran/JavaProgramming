package day13_String;

public class deneme {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES

        String email = "umran_gulle@gmail.com";

        //WRITE YOUR CODE BELOW
        String name = ("" + email.charAt(0)).toUpperCase() + email.substring(1, email.indexOf("_"));
        String lastName = ("" + (email.charAt(email.indexOf("_") + 1))).toUpperCase() + ("" + email.substring(email.indexOf("_") + 2, email.indexOf('@'))).toLowerCase();
        ;
        String domain = ("" + email.charAt(email.indexOf("@") + 1)).toUpperCase() + email.substring(email.indexOf("@") + 2, email.indexOf("."));

        //System.out.println("First name: " + name + "\nLast name: " + lastName + "\nDomain: " + domain);
        System.out.println(domain);
    }
}

