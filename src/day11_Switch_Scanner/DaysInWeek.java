package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number= 1;


        /*if(number==1){
            System.out.println("Monday");*/

        switch (number) {   //(has to be data here)  I want to compare number with 1,2,3,4,5,6,7
            //only comparing the data with other data. you can use == but other operators >< you can not use.
            //you can use all the switch methods in the if statements.
            case 1://it must have a value and has to be unique everytime. can't be taken by other case blocks. it must match the data type of switch, int=int,
                System.out.println("Monday");
               // if you don't give break it will continue to executing. not going to block
            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            default://only gets executes if none of the case blocks are matching
                //you can change default place but if it is not at the end you have to give break;
                System.out.println("invalid number");
                break; // you don't have give break in default, it's optional
            case 6:
                System.out.println("Saturday");
                break;// exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;// blocks the next statements
            //default://only gets executes if none of the case blocks are matching nut if it is not at the end you have to give break;
                //System.out.println("invalid number");
                //break; // you don't have give break in default, it's optional




        }


    }
}
