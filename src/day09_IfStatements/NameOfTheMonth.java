package day09_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {

        int n = 5;

         String names;


        if (n == 1) {
            names = "January";
        } else if (n == 2) {
            names ="February";
        } else if (n == 3) {
            names = "March";
        } else if (n == 4) {
        names = "April";}
        else if (n == 5) {
        names = "May";
        }
        else if (n == 6) {
        names = "June";
        }
        else if (n == 7) {
            names = "July";
        }
        else if (n == 8) {
            names = "August";
        }
        else if (n == 9) {
            names = "September";
        }
        else if (n == 10) {
            names = "October";
        }
        else if (n ==11) {
            names = "November";
        }
        else {
            names = "December";
        }


        System.out.println("the name of the month is " + names);







    }
}
