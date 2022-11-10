package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int day= 6;

        System.out.println(day==1? " Monday" :day==2? "Tuesday": day==3? "Wednesday" : day==4? "Thusday" : day==5? "Friday" :day==6? "Saturday" :day==7? "Sunday" : "invalid number");

        System.out.println("-----------------");

        //String dayOfWeek= day==1? " Monday" :day==2? "Tuesday": day==3? "Wednesday" : day==4? "Thusday" : day==5? "Friday" :day==6? "Saturday" :day==7? "Sunday" : "invalid number";
        //System.out.println(dayOfWeek);

    }
}
