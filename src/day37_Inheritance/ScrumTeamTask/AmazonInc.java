package day37_Inheritance.ScrumTeamTask;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {


        ProductOwner PO = new ProductOwner("Adam", 25, 'm', "12345", 10000);
        ScrumMaster SM = new ScrumMaster("Sarah", 33, 'F', "2323", 120000);
        BusinessAnalyst BA = new BusinessAnalyst("Eren", 34, 'f', "2343", 110000);

        Tester tester1 = new Tester("Chinara", 32, 'F', "1243", "Manual Tester", 125000);
        Tester tester2 = new Tester("Yasemin", 31, 'F', "4565", "Automation Tester", 130000);
        Tester tester3 = new Tester("Irena", 29, 'F', "9565", "Manual Tester", 128000);
        Tester tester4 = new Tester("Cihad", 26, 'M', "3434", "Automation Tester", 125000);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Max", 40, 'M', "3445", "Senior Java Developer", 180000);
        Developer developer2 = new Developer("Allison", 18, 'F', "5454", "Junior Java Developer", 120000);
        Developer developer3 = new Developer("Tom", 26, 'M', "4567", "Java Developer", 140000);
        Developer developer4 = new Developer("Manas", 40, 'M', "9790", "Full Stack Developer", 280000);
        Developer developer5 = new Developer("Evelyn", 30, 'F', "7678", "JS Developer", 160000);
        Developer[] developers = {developer2, developer3, developer4, developer5};

        ScrumTeam scrumTeam= new ScrumTeam(PO, BA, SM);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.removeTester("1243");
        scrumTeam.removeDeveloper("7678");

        System.out.println(scrumTeam);



    }
}
/*
	9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team
 */