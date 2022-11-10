package day24__CustomMethod_Return;

public class warmUpTasks {
    public static void main(String[] args) {

    initials("umran","erdogan");

        System.out.println("---------------------------------------");

    String[]eMails={"ugullee@gmail.com", "abc@abc.com","eren.erdogan@hotmail.com", "asd@gmail.com"};
    for (String mail:eMails){
        eMailDomain(mail);}

        System.out.println("---------------------------------------");

    month(6);

        System.out.println("---------------------------------------");

    days(5);

        System.out.println("---------------------------------------");

    dayOfTheMonth(4,2022);


    }


    public static void initials(String name,String lastName){// name and lastName are arguments of this method
        String initials= name.charAt(0)+"."+lastName.charAt(0);
        System.out.println("initial="+ initials.toUpperCase());

    }


    public static void eMailDomain(String email){
        String domain= email.substring(((email.indexOf("@"))+1), email.lastIndexOf("."));
        System.out.println("domain= "+ domain);

    }



    public static void month(int monthNum) {
        String month = "";
        if (monthNum > 1 && monthNum <= 12) {
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
        } else {
            System.out.println("invalid month number!");
        }

    }

    public static void days(int numOfDay) {
        String day = "";
        if (numOfDay >0 && numOfDay <= 7) {
            day = (numOfDay==1)? "Monday"
                    :(numOfDay==2)? "Tuesday"
                    :(numOfDay==3)? "Wednesday"
                    :(numOfDay==4)?"Thursday"
                    :(numOfDay==5)?"Friday"
                    :(numOfDay==6)?"Saturday"
                    :"Sunday";
            System.out.println("day = " + day);
        } else {
            System.out.println("invalid day number");
        }
    }



    public static void dayOfTheMonth(int month, int year){

        String result= "";

        if (month>=1 && month<=12){
            switch (month) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default:
                    result= "31 days";
            }
            System.out.println("result = " + result);
        }else { System.out.println("invalid month given!");
        }

    }

    public static void ageGroups(int age){

        String ageGroup="";
        if(age>=0 && age>120){
            ageGroup= (age>=0&& age<2)? "toddler":"k";

        }else {
            System.out.println("invalid data!");
        }

    }


}
/*
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */