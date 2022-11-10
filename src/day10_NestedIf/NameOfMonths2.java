package day10_NestedIf;

public class NameOfMonths2 {

    public static void main(String[] args) {

        int month = 11;

        String name = (month==1)? "January" : (month==2) ? "February" : (month==3)? "March" : (month==4)? "April" :(month==5)? "May" :(month==6)? "June" :(month==7)? "July"
                :(month==8)? "August":(month==9)? "September":(month==7)? "October":(month==7)? "November":(month==7)? "December":"Enter a valid number";
//phantasies are optional
        System.out.println(name);

        System.out.println("--------------------------------------------------------");
        System.out.println((month==1)? "January" : (month==2) ? "February" : (month==3)? "March" : (month==4)? "April" :(month==5)? "May" :(month==6)? "June" :(month==7)? "July"
                :(month==8)? "Auguat" :(month==9)? "September":(month==7)? "October":(month==7)? "November":(month==7)? "December":"Enter a valid number");






    }
}
