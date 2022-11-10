package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate, weeklyHours
    int HourlyRate =65;
    int WeeklyHours = 45;
    int NumberOfWeeks = 52;

    int Salary = HourlyRate*WeeklyHours*NumberOfWeeks;

        //System.out.println(salary); if you print soutv, the print will be variable
        System.out.println("WeeklyHours = $" + WeeklyHours);
        System.out.println("HourlyRate = " + HourlyRate);
        System.out.println("NumberOfWeeks = " + NumberOfWeeks);
        System.out.println();
        System.out.println("Salary = $" + Salary);


    }

}
