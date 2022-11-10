package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 5;

        /*boolean Monday = n==1;
        boolean Tuesday = n==2;
        boolean Wednesday = n ==3;
        boolean Thursday = n == 4;
        boolean Friday = n== 5;
        boolean Saturday = n== 6;
        boolean Sunday = n==7;

        if (Monday){
        System.out.println("Today is Monday");}
        else if (Tuesday)
        {System.out.println("Today is Tuesday");}
        else if (Wednesday)
        {System.out.println("Today is Wednesday");}
        else if (Thursday){
            System.out.println("Today is Thursday");}
        else if (Friday)
        {System.out.println("Today is Friday");}
        else if (Saturday) {
        System.out.println("Today is Saturday");}
        else {
            System.out.println("Today is Sunday");}

    }
}
*/
        String day;
        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day ="Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        } else if (n == 5) {
            day = "Friday";
        } else if (n == 6) {
            day = "Saturday";
        } else day = "Sunday";

        System.out.println("Today is " + day);


    }
}