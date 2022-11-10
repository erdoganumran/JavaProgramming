package day24__CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(6);

    }

    public static void nameOfDay(int number){
        if(number<1&&number>7) {//--> whenever we use break, if valid is invalid exit the method
            //exit method terminates everyhing, system.
            //break statement you can only use in loop or switch, break for exiting the loop
            System.out.println("Invalid!");
            return;//exits nameOfDay method in void. it only exits its own method noy any other method
            //so we can still use return method in void method to exit the method
            // if I use System.exit(0): method you have be very carefull because it will also terminate whole program, which mentioned in other programs also will be terminated
            //System.exit(0): 0(zero) means there is no errors in my code
        }
        String day =  day = (number==1)? "Monday"
                    :(number==2)? "Tuesday"
                    :(number==3)? "Wednesday"
                    :(number==4)?"Thursday"
                    :(number==5)?"Friday"
                    :(number==6)?"Saturday"
                    :"Sunday";
            System.out.println("day = " + day);
    }

}



