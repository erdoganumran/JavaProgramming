package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int gradeNumber = 4;

        String detail =( (gradeNumber==1)? "grade - 1\n location -  Apple orchard\n number of groups - 3\n teacher in charge - Ms. Smith"
                :(gradeNumber==2)?  "grade - 2\nlocation - Zoo\n  number of groups - 7\n teacher in charge - Mr. Lee"
                :(gradeNumber==3)? "grade - 3\n location - Aquarium\n number of groups - 5\n teacher in charge - Ms. Wilson"
                :(gradeNumber==4)? "grade - 4\nlocation - Movie theater\nnumber of groups - 2\nteacher in charge - Ms. Reyes"
                :(gradeNumber==5)? "grade - 5\n location - Museum\n number of groups - 5\n teacher in charge - Ms. Lela"
                : "grade - 6 \nlocation - Six Flags\nnumber of groups - 8 \nteacher in charge - Mr. Watt");

        System.out.println(detail);


    }
}

/*
 Create a class called FieldTrip. Your school goes on a Field trip each
year. The place you go will be based on your grade. Given a variable
gradeNumber (1-6) figure out the details of your field trip. Print the
information at the end.
Data based on grade:
grade - 1
location -  Apple orchard
number of groups - 3
teacher in charge - Ms. Smith
grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee
grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson
grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes
grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela
grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
 */