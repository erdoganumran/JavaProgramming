package day17_While_DoWhile;
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {


        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        double cost = 0;
        double premium = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = scan.nextLine();
        String firstname = (("" + name.charAt(0)).toUpperCase() + name.toLowerCase().substring(1, name.indexOf(" ")) + " ");
        String lastname = ("" + name.charAt(name.indexOf(" ") + 1)).toUpperCase() + name.substring(name.indexOf(" ") + 2).toLowerCase();


        System.out.println("Do you have a US driver license?");
        String license = scan.next();
        if (license.equalsIgnoreCase("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        if (zip == 20910 || zip == 20740) {
            premium += 60;
        } else if (zip == 22102 || zip == 222103) {
            premium += 30;
        } else {
            premium += 50;
        }


        System.out.println("Is this vehicle owned, financed, or leased?");
        String priority = scan.next();
        if (priority.equalsIgnoreCase("owned")) {
            premium += 10;
        } else if (priority.equalsIgnoreCase("financed")) {
            premium += 15;
        } else {
            premium += 20;
        }


        System.out.println("How is this vehicle primarily used?");
        String used = scan.next();
        if (used.equalsIgnoreCase("business")) {
            premium += 50;
        } else if (used.equalsIgnoreCase("pleasure")) {
            premium += 10;
        } else {
            System.out.println("How many days do you commute?");
            int commute = scan.nextInt();
            premium += commute * 5 + 20;
        }


        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age >= 16 && age < 20) {
            premium *= 10;
        } else if (age >= 20 && age < 25) {
            premium *= 6;
        } else {
            premium *= 2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("YES")) {
            System.out.println("How many?");
            int acc = scan.nextInt();
            premium += (acc * 10);
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education = scan.nextLine();
        //scan.nextLine();

        if (education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
            premium -= (premium * 0.05);
        } else if (education.equalsIgnoreCase("PHD")) {
            premium -= (premium * 0.1);
        } else {
            education= "" + education.substring(0, education.indexOf(" ")) + education.substring(education.indexOf(" ") + 1);
            premium -= (premium * 0.05);
        }




        String referenceNumber = name.substring(0, 2).toUpperCase() + age + name.substring(name.length() - 3).toUpperCase()
                + zip + education.toUpperCase();

        System.out.println(firstname + lastname + ", here's your quote!\n"
               + "This is your start premium cost: $" + premium
               + "\nThis is your reference number: "+ referenceNumber);
    }
}