package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a =false;

        for (int i = 0; a;  ) {
            System.out.println("Wooden Sppon - for  loop");}


        System.out.println("---------------------------------------------");

        while (a){// a is false and so this while loop are not gonna executed.
            //if while loop is true it will print sout
            System.out.println("Wooden Spoon - while loop");
        }

        System.out.println("--------------------------------------------------");

        do{
            System.out.println("Wooden Spoon - do while loop");
        }while(a);// here it will check first do stetement and print "Wooden Spoon"
        //then check while it if the contition is true  (a) do block will be repetad again
        //but if the cond is not true do block not gonna executed

// if the contition is fale only do while loop executes. that is the only difference with the while loop

    }
}
/*
while loop: repeated if statement

	while(condition){
		statement;
	}


do -while : JUST DO IT

		do{
			statement;
		}while(condition);


branching statements:
			break statement: exits the loop & switch
			continue statement: skips the current iteration


 */