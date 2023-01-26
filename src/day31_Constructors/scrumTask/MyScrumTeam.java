package day31_Constructors.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
        ScrumTeam s1= new ScrumTeam("Eren","Jimmy", "Anastasia", 10);//devops and tester are contained in this constructor. when you add new tester or devops, it will be addes s1(scrumteam)
        Tester t1= new Tester("Umran", 124, "SDET", 12000);
        Tester t2= new Tester("Suha", 125, "SDET", 13000);
        Tester t3= new Tester("Seyma", 127, "SDET", 11000);
        Tester t4= new Tester("Sadi", 128, "SDET", 13000);

        Tester[]testers= {t1, t2,t3,t4};


        Developer d1= new Developer("Adam", 135, "Developer", 170000);
        Developer d2= new Developer("Anna", 136, "Developer", 155000);
        Developer d3= new Developer("Bob", 137, "Developer", 160000);
        Developer d4= new Developer("Cane", 138, "Developer", 70000);
        Developer d5= new Developer("Zack", 130, "Developer", 60000);

        Developer [] developers= {d1, d2,d3,d4,d5};

        s1.addTesters(testers);
        s1.addDevelopers(developers);

        System.out.println(s1);

        for (Tester eachTester:testers ){
            System.out.println(eachTester.name+ " : " + eachTester.salary);
        }
        for (Developer developer : s1.devopsList) {
            System.out.println(developer.name+ " : " + developer.salary);
        }
        System.out.println("------------------------------------------------");

        s1.removeTester(127);//testerslardan silmiyor, s1 yani constructordan siliyor
        s1.removeDeveloper(138);
        System.out.println(Arrays.asList(testers));
        System.out.println(s1);

    }
}
