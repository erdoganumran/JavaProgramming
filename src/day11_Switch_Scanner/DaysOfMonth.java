package day11_Switch_Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {

        String month = "February";
        int year=2001;


        /*int day;

        switch (month){

            case "January": case "March": case"May": case "July": case "August": case"October": case "December": day = 31;
                System.out.println(day);
                break;
            case "February":
                if (year%4==0)
                System.out.println(29);
                else System.out.println(28);
                break;
            case "April": case "June": case "September": case "November": day = 30;
                System.out.println(day);
                break;
            default:
                System.out.println("invalid number");
                }
*/

        String result= "";

        int number =6;
        if (number>0 && number<=12){
        switch (number) {
            case 2:
                result = (year % 4 == 0) ? "29 days" : "28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;
            /* case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;*/
            default:
                result= "31 days";
        }
        }else { result= "invalid number";
        }
        System.out.println(result);



    }
}
