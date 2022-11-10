package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Umran";
        int age =34;
        String citizen = "USA";

        boolean isEligible = age >=18 && citizen== "USA";

        if (isEligible){
            System.out.println(name + " is eligible to vote");
        }
        if (!isEligible) {
            System.out.println(name + " is not eligible to vote");
        }


    }

}
