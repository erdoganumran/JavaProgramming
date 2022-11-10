package day10_NestedIf;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {
        int number = 14;
        String month = ""; // temporary assignment is not the final data

        if (number>=1 && number<=12)
            if (number==1)
                month="January"; // if there is just one statement in the block so we don't have to use {}
            //if we have more one statement we have to use {} but the best way is including the {}
            else if (number==2)
                month="February"; // there is just one else so we don't have to use {}
            else if (number==3)
                month="March";
            else if (number==4)
                month="April";
            else if (number==5)
                month="May";
            else if (number==6)
                month="June";
            else if (number==7) month="July";
            else if (number==8)
                month="August";
            else if (number==9)
                month="September";
            else if (number==10)
                month="October";
            else if (number==11)
                month="November";
            else  month="December";

        else  month = " invalid";

        System.out.println("Given month is " + month);

    }
}


