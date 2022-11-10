package day24__CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        month(14);

    }

    public static void month(int monthNum) {

        if (monthNum < 1 || monthNum > 12) {
            System.out.println("invalid month number!");
            return;}// it will exit the method and remaining part are not going to work
        String month = "";
            switch (monthNum) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                default:
                    month = "December";
                    break;
            }
            System.out.println("month = " + month);

    }
}
