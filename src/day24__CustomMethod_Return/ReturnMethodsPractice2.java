package day24__CustomMethod_Return;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {

        String grd= grade(101);// it is resuable anymore. but if the method down below was void method, I couldn't use this data here.
        System.out.println("You Score = " + grd);
        if(grd.equals("A")||grd.equals("B")||grd.equals("C")||grd.equals("D")){
            System.out.println("Passed");
        }
        else if (grd.equals("F")){
            System.out.println("Try again!");
        }

    }



    public static String grade(int score){// grade is method name which I can use it later in other methods to cal it

        String grade= (score<101&&score>=90)? "A":(score<90&&score>=80)? "B":(score<80&&score>=70)? "C":(score<70&&score>=60)? "D":(score>=0&&score<60)?"F":"Invalid data!";
        return grade;//reusable

    }


}
